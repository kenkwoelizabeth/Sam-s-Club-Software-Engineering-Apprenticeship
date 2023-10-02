package org.example.OOP;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private String name;
    private List<Book> books;
    private List<Person> members;
    private int bookIdCounter;
    private int personIdCounter;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
        members = new ArrayList<>();
        bookIdCounter = 1; // Initialize book ID counter
        personIdCounter = 1; // Initialize person ID counter
    }

    public void addBook(String name, String author, double price, boolean inStock, String genre) {
        String ISBN = "ISBN" + bookIdCounter;
        Book book = new Book(ISBN, name, author, price, inStock, genre);

        books.add(book);
        bookIdCounter++;
    }


    public void addPerson(String name, String phoneNumber) {
        int id = personIdCounter;
        Person person = new Person(id, name, phoneNumber, new ArrayList<>());
        members.add(person);
        personIdCounter++;
    }

    public void listBooks() {
        System.out.println("Available Books in " + name + ":");
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println(book.getName() + " by " + book.getAuthor());
            }
        }
    }

    public void listCheckedOutBooks() {
        System.out.println("Checked Out Books in " + name + ":");
        for (Book book : books) {
            if (book.isCheckedOut()) {
                System.out.println(book.getName() + " by " + book.getAuthor() + " (Checked out by " + book.getCheckedOutBy().getName() + ")");
            }
        }
    }

    public boolean checkOutBook(String ISBN, int personId) {
        Book book = findBookByISBN(ISBN);
        Person person = findPersonById(personId);

        if (book == null || person == null) {
            return false;
        }

        if (book.isCheckedOut() || !person.getBorrowedBooks().isEmpty()) {
            return false;
        }

        book.setCheckedOut(true);
        book.setCheckedOutBy(person);
        person.borrowBook(book);
        return true;
    }

    public boolean checkInBook(String ISBN, int personId) {
        Book book = findBookByISBN(ISBN);
        Person person = findPersonById(personId);

        if (book == null || person == null) {
            return false;
        }

        if (!book.isCheckedOut() || book.getCheckedOutBy() != person) {
            return false;
        }

        book.setCheckedOut(false);
        book.setCheckedOutBy(null);
        person.returnBook(book);
        return true;
    }

    Book findBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }

    Person findPersonById(int personId) {
        for (Person person : members) {
            if (person.getId() == personId) {
                return person;
            }
        }
        return null;
    }
}



