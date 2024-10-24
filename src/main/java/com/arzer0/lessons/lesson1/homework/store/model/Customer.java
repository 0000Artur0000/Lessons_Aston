package com.arzer0.lessons.lesson1.homework.store.model;

public class Customer {
    private final String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public boolean canPay(double amount) {
        return balance >= amount;
    }

    public void decreaseBalance(double amount) {
        balance -= amount;
    }

    public Order makeOrder() {
        System.out.println("Клиент " + name + " начал делать заказ.");
        return new Order(this);
    }

    public void payForOrder(Order order) {
        double totalPrice = order.getTotalPrice();
        if (canPay(totalPrice)) {
            order.setPaid(true);
            decreaseBalance(totalPrice);
            System.out.println("Клиент " + name + " оплатил заказ на сумму " + totalPrice + ". Остаток на балансе: " + balance);
        } else {
            System.out.println("У клиента " + name + " недостаточно средств для оплаты заказа.");
        }
    }
}
