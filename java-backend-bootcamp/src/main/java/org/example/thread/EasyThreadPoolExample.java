package org.example.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class EasyThreadPoolExample {

    public static void main(String[] args) {
        // Step 1: Create a thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Step 2: List of names to print
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Step 3: Submit tasks to the executor
        for (String name : names) {
            System.out.println("📝 Submitting task for: " + name);

            executor.submit(() -> {
                System.out.println("👤 Hello from: " + name + " | " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500); // Simulate some delay
                } catch (InterruptedException e) {
                    System.out.println("❌ Interrupted: " + name);
                }
            });
        }

        // Step 4: Gracefully shut down the executor
        executor.shutdown();
        System.out.println("🛑 Shutdown initiated...");

        try {
            // Step 5: Wait for tasks to complete
            if (!executor.awaitTermination(3, TimeUnit.SECONDS)) {
                System.out.println("⏱️ Timeout! Forcing shutdown...");
                List<Runnable> notExecuted = executor.shutdownNow();
                System.out.println("🚫 Not executed: " + notExecuted.size());
            }
        } catch (InterruptedException e) {
            System.out.println("❌ Await interrupted");
            executor.shutdownNow();
        }

        // Step 6: Check shutdown status
        System.out.println("📦 Is Shutdown? " + executor.isShutdown());
        System.out.println("✔️ Is Terminated? " + executor.isTerminated());
    }
}
