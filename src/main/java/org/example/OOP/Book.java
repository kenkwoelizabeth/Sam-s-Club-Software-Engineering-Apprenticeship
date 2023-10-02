package org.example.OOP;

public class Book {

    //fields
    private String ISBN;
    private String name;
    private String author;
    private double price;
    private boolean inStock;
    private String genre;
    private boolean checkedOut;
    private boolean checkedIn;
    private Person checkedOutBy;
    // empty constructor

    public Book() {
    }

    // constructor

    public Book(String ISBN, String name, String author, double price, boolean inStock, String genre) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
        this.genre = genre;

    }


    //getters and setters


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public Person getCheckedOutBy() {
        return checkedOutBy;
    }

    public void setCheckedOutBy(Person checkedOutBy) {
        this.checkedOutBy = checkedOutBy;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }
    //methods


}
