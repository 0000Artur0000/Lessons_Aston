package com.arzer0.lessons.lesson1.homework.store.model;

import java.util.List;

public class SalesRecord {
    private final List<Product> products;
    private final Customer customer;

    public SalesRecord(List<Product> products, Customer customer) {
        this.products = products;
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }
}
