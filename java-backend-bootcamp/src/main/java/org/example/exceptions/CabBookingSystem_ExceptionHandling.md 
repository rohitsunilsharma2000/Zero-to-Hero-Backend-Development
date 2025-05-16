Absolutely! Let's add **exception handling** to your **Cab Booking System in Java** to make it more **robust, user-friendly, and maintainable**.

---

## ✅ Step-by-Step Plan

### 1. **Define Custom Exceptions**

We'll define specific exceptions for clear feedback (e.g., `CabNotAvailableException`, `InvalidUserException`).

### 2. **Use Try-Catch Blocks**

We'll wrap sensitive logic (like booking or canceling rides) in `try-catch` blocks.

### 3. **Centralize Error Messages**

We'll make messages user-friendly and developer-friendly.

---

## ✅ Step 1: Custom Exceptions

```java
// Thrown when no cab is available
public class CabNotAvailableException extends RuntimeException {
    public CabNotAvailableException(String message) {
        super(message);
    }
}

// Thrown for invalid rider or driver actions
public class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message) {
        super(message);
    }
}
```

---

## ✅ Step 2: Example Usage in Booking Logic

```java
public class RideService {

    private List<Cab> availableCabs;

    public RideService(List<Cab> availableCabs) {
        this.availableCabs = availableCabs;
    }

    public void bookCab(Rider rider, String pickupLocation) {
        try {
            if (rider == null) {
                throw new InvalidUserException("Rider not found.");
            }

            Cab cab = findNearestAvailableCab(pickupLocation);
            if (cab == null) {
                throw new CabNotAvailableException("No cab available nearby.");
            }

            cab.setAvailable(false);
            System.out.println("Cab booked successfully for " + rider.getName());

        } catch (InvalidUserException | CabNotAvailableException e) {
            System.err.println("Booking failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }

    private Cab findNearestAvailableCab(String pickupLocation) {
        // Dummy search logic
        return availableCabs.stream()
                .filter(Cab::isAvailable)
                .findFirst()
                .orElse(null);
    }
}
```

---

## ✅ Step 3: Driver Code

```java
public class Main {
    public static void main(String[] args) {
        List<Cab> cabs = new ArrayList<>();
        cabs.add(new Cab("WB01A1234", true));
        cabs.add(new Cab("WB01B5678", false));

        Rider rider = new Rider("John Doe");

        RideService rideService = new RideService(cabs);
        rideService.bookCab(rider, "Park Street");
    }
}
```

---

## ✅ Example Output

```
Cab booked successfully for John Doe
```

Or if no cab is available:

```
Booking failed: No cab available nearby.
```

---

If you'd like, I can also help you:

* Handle logging using `SLF4J` or `java.util.logging`
* Convert it into a Spring Boot REST API
* Add global exception handling

Let me know your next step 🚀
Great! Let’s implement **exception handling** in your `Cab` class as well to ensure data integrity and enforce business rules at the cab level.

---

## ✅ Updated `Cab` Class with Validations

```java
public class Cab {
    private String cabNumber;
    private boolean isAvailable;

    // Constructor with validation
    public Cab(String cabNumber, boolean isAvailable) {
        if (cabNumber == null || cabNumber.isEmpty()) {
            throw new IllegalArgumentException("Cab number cannot be null or empty");
        }
        this.cabNumber = cabNumber;
        this.isAvailable = isAvailable;
    }

    // Getter for cab number
    public String getCabNumber() {
        return cabNumber;
    }

    // Getter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for availability
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public String toString() {
        return "Cab{" +
                "cabNumber='" + cabNumber + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
```

---

### ✅ Example Usage with Exception Handling

```java
public class CabTest {
    public static void main(String[] args) {
        try {
            Cab cab = new Cab("WB12XY1234", true); // Valid
            System.out.println("Cab created: " + cab);

            Cab invalidCab = new Cab("", true); // Invalid
        } catch (IllegalArgumentException e) {
            System.err.println("Failed to create cab: " + e.getMessage());
        }
    }
}
```

---

### ✅ Output

```
Cab created: Cab{cabNumber='WB12XY1234', isAvailable=true}
Failed to create cab: Cab number cannot be null or empty
```

---

Would you like me to proceed with adding similar validation and exception handling for the `Rider` and `Driver` classes next?

Perfect! Let's now implement the `Rider` class with **OOP best practices** and proper **exception handling** just like we did with the `Cab` class.

---

## ✅ Rider Class with Exception Handling

```java
public class Rider {
    private String name;

    // Constructor with validation
    public Rider(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Rider name cannot be null or empty");
        }
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Optional: Setter with validation if you want to allow name changes
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Rider name cannot be null or empty");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rider{name='" + name + "'}";
    }
}
```

---

### ✅ Example Usage

```java
public class RiderTest {
    public static void main(String[] args) {
        try {
            Rider rider1 = new Rider("Alice");
            System.out.println("Rider created: " + rider1);

            Rider rider2 = new Rider(""); // Invalid name
        } catch (IllegalArgumentException e) {
            System.err.println("Failed to create rider: " + e.getMessage());
        }
    }
}
```

---

### ✅ Output

```
Rider created: Rider{name='Alice'}
Failed to create rider: Rider name cannot be null or empty
```

---

### ✅ Summary of Concepts Used

| Concept             | Explanation                                   |
|---------------------|-----------------------------------------------|
| **Encapsulation**   | Private field + public getter/setter          |
| **Constructor check** | Validates input at the time of object creation |
| **Exception Handling** | Throws `IllegalArgumentException` for invalid input |

---

Next up: would you like the same pattern for the `Driver` class or move on to a feature like `cancelRide()` or `ride summary`?

