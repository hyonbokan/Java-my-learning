package org.example.ecommerce;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> productList;

    public Cart() {
        this.productList = new HashMap<>();
    }

    public Cart(Map<Product, Integer> productList) {
        this.productList = productList;
    }

    public Map<Product, Integer> getProductList() {
        return productList;
    }

    public void setProductList(Map<Product, Integer> productList) {
        this.productList = productList;
    }

    public void addProduct(Product productToAdd, int quantity) {
        if (productToAdd.getQuantity() < quantity) {
            System.out.println("Insufficient quantity of " + productToAdd.getProductName());
            return;
        }
        productToAdd.setQuantity(productToAdd.getQuantity() - quantity);

        this.productList.put(productToAdd, quantity);
        System.out.println(productToAdd.getProductName() + " add with a quantity of " + quantity);
    }

    public void removeProduct(Product productToRemove) {
        if (this.productList.isEmpty()) {
            return;
        }
        if (this.productList.containsKey(productToRemove)) {
            this.productList.remove(productToRemove);
            System.out.println(productToRemove.getProductName() + " has been removed.");
        } else {
            System.out.println("Product not found in the list.");
        }
    }

    public double calcTotal() {
        if (productList == null) {
            return 0;
        }

        double totalPrice = 0;

        for (Map.Entry<Product, Integer> entry : productList.entrySet()) {
            Double price = entry.getKey().getPrice();
            if (price != null) {
                totalPrice += price * entry.getValue();
            }
        }

        // or use steam
//        return productList.entrySet().stream().mapToDouble(entry -> (entry.getKey().getPrice() != null ?
//                entry.getKey().getPrice() : 0) * entry.getValue()).sum();
        System.out.println(totalPrice);
        return totalPrice;
    }

}
