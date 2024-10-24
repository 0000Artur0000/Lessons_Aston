package com.arzer0.lessons.lesson1.homework.store;

import com.arzer0.lessons.lesson1.homework.store.logic.StoreSystem;
import com.arzer0.lessons.lesson1.homework.store.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        List<Admin> admins = Arrays.asList(
                new Admin("Анна Иванова"),
                new Admin("Максим Петров")
        );

        List<Customer> customers = Arrays.asList(
                new Customer("Иван Сидоров", 6003300),
                new Customer("Мария Кузнецова", 200330),
                new Customer("Сергей Николаев", 1330)
        );

        List<Product> products = Arrays.asList(
                new Product("Смартфон", 50000),
                new Product("Ноутбук", 70000),
                new Product("Наушники", 3000)
        );

        Random random = new Random();

        products.forEach(product -> {
            Admin admin = admins.get(random.nextInt(admins.size()));
            StoreSystem.addProduct(product, admin);
        });

        customers.forEach(customer -> {
            Order order = customer.makeOrder();
            int numProductsInOrder = random.nextInt(products.size()) + 1;

            for (int i = 0; i < numProductsInOrder; i++) {
                Product product = products.get(random.nextInt(products.size()));
                order.addProduct(product);
            }

            customer.payForOrder(order);

            Admin admin = admins.get(random.nextInt(admins.size()));
            StoreSystem.processOrder(order, admin);
        });

        System.out.println("\nПродажи:");
        StoreSystem.getSalesRecords().forEach(salesRecord -> {
            System.out.println("Клиент " + salesRecord.getCustomer().getName() + " купил товары: ");
            salesRecord.getProducts().forEach(product ->
                    System.out.println("- " + product.getName() + " за " + product.getPrice()));
        });
    }
}
