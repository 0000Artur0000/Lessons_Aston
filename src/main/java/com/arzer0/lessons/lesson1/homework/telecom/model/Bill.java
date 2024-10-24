package com.arzer0.lessons.lesson1.homework.telecom.model;

public class Bill {
    private final double amount;
    private boolean isPaid;

    public Bill(double amount) {
        this.amount = amount;
        this.isPaid = false;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
