package org.example.library_management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private List<User> users;
    private Map<Book, User> borrowedBooks;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
        borrowedBooks = new HashMap<>();
    }

    public Library(List<Book> books, List<User> users, Map<Book, User> borrowedBooks) {
        this.books = books;
        this.users = users;
        this.borrowedBooks = new HashMap<>(borrowedBooks);
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<Book, User> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBook(Book book) {
        this.books.add(book);
        System.out.println(book.getTitle() + " is added\n");
    }

    public void addBooks(List<Book> booksToAdd) {
        booksToAdd.forEach(book -> {
            books.add(book);
            System.out.println(book.getTitle() + " is added\n");
        });
    }

    public void registerUser(User user) {
        this.users.add(user);
        System.out.println(user.getName() + " is registered\n");
    }

    public void borrowBooks(User user, List<Book> booksToBorrow) {
        // check if user is registered
        if (!users.contains(user)){
            System.out.println("User is not registered\n");
            return;
        }

        if (books.isEmpty()) {
            System.out.println("There are no books in the lib\n");
            return;
        }

        // check if the books are in the lib
        List<Book> missingBooks = booksToBorrow.stream()
                .filter(book -> !books.contains(book))
                .collect(Collectors.toList());

        if (!missingBooks.isEmpty()) {
            missingBooks.forEach(book -> {
                System.out.println(book.getTitle() + "is not in the lib");
            });
            return;
        }

        // check available books
        List<Book> availableBooks = books.stream().filter(book ->
                        book.getAvailable() && booksToBorrow.contains(book))
                .collect(Collectors.toList());

        if (!availableBooks.isEmpty()) {
            availableBooks.forEach(book -> {
                borrowedBooks.put(book, user);
                book.setAvailable(false);
                user.getBooks().add(book);
                System.out.println("\nThe book \"" + book.getTitle() + "\" has been successfully borrowed by " + user.getName() + ".");
            });
        }

    }

    public List<Book> availableBooks() {
        return books.stream().filter(book -> book.getAvailable()).collect(Collectors.toList());
    }


    public void returnBooks(User user, List<Book> booksToReturn) {
        if (!users.contains(user)){
            System.out.println("User is not registered\n");
            return;
        }

        List<Book> invalidReturns = booksToReturn.stream().filter(book ->
                !borrowedBooks.containsKey(book) || !borrowedBooks.get(book).equals(user))
                .collect(Collectors.toList());


        if (!invalidReturns.isEmpty()) {
            invalidReturns.forEach(book -> System.out.println("Error: The book \"" + book.getTitle() + "\" is not borrowed by " + user.getName() + "."));
            return; // Exit early if any invalid return is found
        }

        booksToReturn.forEach(book -> {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            user.getBooks().remove(book);
            System.out.println("Success: The book \"" + book.getTitle() + "\" has been successfully returned by " + user.getName() + ".");
        });
    }
}
