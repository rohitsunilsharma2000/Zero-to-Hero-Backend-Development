package org.example.oops;


//✅ 4. Polymorphism – Use common interface for issuing history
class IssueManager {
    public void issueBook(Book book, User user) {
        if (!book.isIssued()) {
            book.issueBook();
            System.out.println(user.name + " issued the book: " + book.getTitle());
        } else {
            System.out.println("Book already issued.");
        }
    }

    public void returnBook(Book book, User user) {
        if (book.isIssued()) {
            book.returnBook();
            System.out.println(user.name + " returned the book: " + book.getTitle());
        } else {
            System.out.println("Book is not issued.");
        }
    }
}
