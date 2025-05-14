package org.example.oops;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith");

        User student = new Student("Alice", "S101");
        User teacher = new Teacher("Dr. Bob", "T202");

        IssueManager manager = new IssueManager();

        student.showUserType();  // Polymorphism
        teacher.showUserType();  // Polymorphism

        manager.issueBook(book1, student);
        manager.returnBook(book1, teacher);
    }
}
