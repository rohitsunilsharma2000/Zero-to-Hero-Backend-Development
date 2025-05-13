package org.example.fundamentals;

import java.util.Scanner;

public class StudentGradeCalculator {

    // Method to calculate total marks
    public static int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total = total+mark;
        }
        return total;
    }

    // Method to calculate average marks
    public static double calculateAverageMarks(int totalMarks) {
        return totalMarks / 5.0;
    }

    // Method to assign grade based on average marks
    public static String assignGrade(double average) {
        if (average >= 90) {
            return "A (Excellent)";
        } else if (average >= 70) {
            return "B (Good)";
        } else if (average >= 50) {
            return "C (Average)";
        } else if (average >= 40) {
            return "D (Needs Improvement)";
        } else {
            return "F (Fail)";
        }
    }

    // Method to generate and display the report card
    public static void generateReportCard(String name, int[] marks, int totalMarks, double average, String grade) {
        System.out.println("\n--- Report Card ---");
        System.out.println("Student Name: " + name);
        System.out.println("Marks: ");
        System.out.println("Math: " + marks[0]);
        System.out.println("Science: " + marks[1]);
        System.out.println("English: " + marks[2]);
        System.out.println("History: " + marks[3]);
        System.out.println("Geography: " + marks[4]);
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.println("Average Marks: " + average + "/100");
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Input marks for each subject
        int[] marks = new int[5];
        System.out.println("Enter marks for the following subjects: ");
        System.out.print("Math: ");
        marks[0] = scanner.nextInt();
        System.out.print("Science: ");
        marks[1] = scanner.nextInt();
        System.out.print("English: ");
        marks[2] = scanner.nextInt();
        System.out.print("History: ");
        marks[3] = scanner.nextInt();
        System.out.print("Geography: ");
        marks[4] = scanner.nextInt();

        // Calculate total marks, average, and grade
        int totalMarks = calculateTotalMarks(marks);
        double averageMarks = calculateAverageMarks(totalMarks);
        String grade = assignGrade(averageMarks);

        // Generate and display the report card
        generateReportCard(name, marks, totalMarks, averageMarks, grade);
    }


}
