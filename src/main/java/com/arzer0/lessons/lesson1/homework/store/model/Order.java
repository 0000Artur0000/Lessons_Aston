package com.arzer0.lessons.lesson1.homework.store.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final Customer customer;
    private final List<Product> products = new ArrayList<>();
    private boolean isPaid = false;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Товар " + product.getName() + " добавлен в заказ.");
    }

    public double getTotalPrice() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        this.isPaid = paid;
    }
}
