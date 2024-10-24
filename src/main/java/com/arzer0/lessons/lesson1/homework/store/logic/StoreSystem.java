package com.arzer0.lessons.lesson1.homework.store.logic;

import com.arzer0.lessons.lesson1.homework.store.model.*;

import java.util.ArrayList;
import java.util.List;

public class StoreSystem {
    private static List<Product> availableProducts = new ArrayList<>();
    private static List<Customer> blacklistedCustomers = new ArrayList<>();
    private static List<SalesRecord> salesRecords = new ArrayList<>();

    public static void addProduct(Product product, Admin admin) {
        availableProducts.add(product);
        System.out.println("Администратор " + admin.getName() + " добавил продукт: " + product.getName());
    }

    public static void processOrder(Order order, Admin admin) {
        Customer customer = order.getCustomer();

        if (blacklistedCustomers.contains(customer)) {
            System.out.println("Клиент " + customer.getName() + " в черном списке. Заказ не обработан.");
            return;
        }

        if (order.isPaid()) {
            salesRecords.add(new SalesRecord(order.getProducts(), customer));
            System.out.println("Администратор " + admin.getName() + " обработал заказ клиента " + customer.getName());
        } else {
            System.out.println("Клиент " + customer.getName() + " не оплатил заказ. Добавление в черный список.");
            blacklistCustomer(customer);
        }
    }

    public static void blacklistCustomer(Customer customer) {
        blacklistedCustomers.add(customer);
        System.out.println("Клиент " + customer.getName() + " добавлен в черный список.");
    }

    public static List<SalesRecord> getSalesRecords() {
        return salesRecords;
    }
}
