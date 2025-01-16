package org.example.ecommerce;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class Order {
    private long orderId;
    private LocalDateTime orderDate = LocalDateTime.now();
    private Map<Product, Integer> items;
    private double totalAmount;

    public Order(long orderId, Cart cart) {
        this.orderId = orderId;
        this.items = cart.getProductList();
        this.totalAmount = cart.calcTotal();
    }


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public void setItems(Map<Product, Integer> items) {
        this.items = items;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void getSummary() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm");
        System.out.println(
                "Order ID: " + orderId
                        + " Date: " + orderDate.format(formatter)
                        + " Total amount: " + totalAmount + "$"
        );

        items.forEach((product, quantity) ->
            System.out.println("Details: " + product.getProductName() + " x " + quantity)
                );
    }
}
