package org.example.OOP;

public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library("My Library");

        // Add books to the library
        library.addBook("ISBN1", "Kris", 34.50, true, "Music");
        library.addBook("ISBN2", "Mathew", 33.0, true, "Love");

        // Add persons (members) to the library
        library.addPerson("Alice", "555-1234");
        library.addPerson("Bob", "555-5678");

        // List available books
        library.listBooks();

        // Alice checks out Book1
        Book book1 = library.findBookByISBN("ISBN1");
        Person alice = library.findPersonById(1);

        if (book1 != null && alice != null) {
            boolean checkoutSuccess = book1.isCheckedOut();
            if (checkoutSuccess) {
                System.out.println(alice.getName() + " has checked out " + book1.getName());
            } else {
                System.out.println("Unable to check out " + book1.getName());
            }
        }

        // List checked out books
        library.listCheckedOutBooks();

        // Alice checks in Book1
        if (book1 != null && alice != null) {
            boolean checkInSuccess = book1.isCheckedIn();
            if (checkInSuccess) {
                System.out.println(alice.getName() + " has checked in " + book1.getName());
            } else {
                System.out.println("Unable to check in " + book1.getName());
            }
        }

        // List checked out books after check-in
        library.listCheckedOutBooks();
    }
}