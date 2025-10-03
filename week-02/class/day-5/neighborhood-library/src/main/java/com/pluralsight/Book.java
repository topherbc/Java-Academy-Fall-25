package com.pluralsight;

public class Book {
    private int id;
    private String isbn, title, checkOutTo;
    private boolean isCheckedOut;

    public Book(int id, String isbn, String title, String checkOutTo, boolean isCheckedOut) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.checkOutTo = checkOutTo;
        this.isCheckedOut = isCheckedOut;
    }

    public void checkOut(String name) {

    }

    public void checkIn() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCheckOutTo() {
        return checkOutTo;
    }

    public void setCheckOutTo(String checkOutTo) {
        this.checkOutTo = checkOutTo;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }
}
