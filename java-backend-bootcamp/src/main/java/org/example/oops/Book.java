package org.example.oops;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//✅ 3. Encapsulation – Book class with private fields/**/
public class Book {
    private String title;

    private String author;
    private boolean isIssued;


    public Book ( String title , String author ) {
        this.title = title;
        this.author = author;
    }
    // Method to issue book
    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued: " + title);
        } else {
            System.out.println("Book is already issued.");
        }
    }

    // Method to return book
    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not issued.");
        }
    }

    // Optional: check status
    public boolean isIssued() {
        return isIssued;
    }
}
