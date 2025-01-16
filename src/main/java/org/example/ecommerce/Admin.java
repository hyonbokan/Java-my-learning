package org.example.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Product> products;
    private List<User> users;

    public Admin(List<Product> products, List<User> users) {
        this.products = new ArrayList<>(products);
        this.users = new ArrayList<>(users);
    }

    public Admin() {
        this.products = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addProduct(Product productToAdd) {
        if (products.contains(productToAdd)) {
            return;
        }
        products.add(productToAdd);
        System.out.println(productToAdd.getProductName() + " is added to the system.");
    }

    public void registerUser(User userToRegister) {
        if (users.contains(userToRegister)) {
            return;
        }
        users.add(userToRegister);
        System.out.println(userToRegister.getName() + " has been registered in the system.");
    }

    public void displayProducts() {
        System.out.println("Display all products");
        products.forEach(product -> {
            System.out.println(product.getProductName() + " x " + product.getQuantity());
        });
    }
}
