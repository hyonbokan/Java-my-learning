package org.example;

import org.example.ecommerce.Admin;
import org.example.ecommerce.Cart;
import org.example.ecommerce.Order;
import org.example.ecommerce.Product;

public class Main {
    public static void main(String[] args) {
        Product macbookPro = new Product(1, "Macbook Pro", 1289.8, 1);
        Product ps5Controller = new Product(4, "ps5 controller", 399.0, 2);

        Admin admin = new Admin();
        admin.addProduct(macbookPro);
        admin.addProduct(ps5Controller);
        admin.displayProducts();

        Cart cart = new Cart();

//        cart.addProduct(macbookPro, 1);
//        cart.calcTotal();

//        Order newOrder = new Order(1, cart);
//        newOrder.getSummary();
    }
}