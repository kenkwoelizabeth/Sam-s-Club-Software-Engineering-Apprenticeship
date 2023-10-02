package org.example.OOP;

import java.util.List;

public class Person {
    private int id;
    private String name;
    private String phoneNumber;
    private List<Book> borrowedBooks;

    // empty constructor

    public Person() {
    }

    //constructor

    public Person(int id, String name, String phoneNumber, List<Book> borrowedBooks) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = borrowedBooks;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nPhone Number: " + phoneNumber;
    }
}
