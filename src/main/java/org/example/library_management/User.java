package org.example.library_management;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private long userID;
    private List<Book> books = new ArrayList<>();

    public User(String name, long userID, List<Book> books) {
        this.name = name;
        this.userID = userID;
        this.books = new ArrayList<>(books);
    }

    public User(String name, long userID) {
        this.name = name;
        this.userID = userID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getuserID() {
        return this.userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
