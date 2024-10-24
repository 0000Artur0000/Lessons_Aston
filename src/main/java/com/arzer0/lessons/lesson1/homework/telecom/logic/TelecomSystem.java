package com.arzer0.lessons.lesson1.homework.telecom.logic;

import com.arzer0.lessons.lesson1.homework.telecom.model.*;

public class TelecomSystem {
    public static void processPayment(Subscriber subscriber, Bill bill, Administrator admin) {
        subscriber.payBill(bill);
        if (bill.isPaid()) {
            System.out.println("Абонент " + subscriber.getName() + " оплатил счет.");
            admin.reconnectSubscriber(subscriber);
        } else {
            System.out.println("Абонент " + subscriber.getName() + " не оплатил счет.");
        }
    }
}
