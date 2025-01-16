package org.example.ecommerce;

import org.example.library_management.Book;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private long userId;
    private String email;
    private Cart cart;
    private List<Order> orderHistory;

    public User(String name, long userId, String email, Cart cart, List<Order> orderHistory) {
        this.name = name;
        this.userId = userId;
        this.email = email;
        this.cart = cart;
        this.orderHistory = new ArrayList<>(orderHistory);
    }

    public User(String name, long userId, String email, Cart cart) {
        this.name = name;
        this.userId = userId;
        this.email = email;
        this.cart = cart;
        this.orderHistory = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
}
