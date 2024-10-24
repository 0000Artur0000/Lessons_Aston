package com.arzer0.lessons.lesson1.homework.telecom.model;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {
    private final String name;
    private String phoneNumber;
    private List<Service> services = new ArrayList<>();
    private List<Bill> bills = new ArrayList<>();

    public Subscriber(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void subscribeService(Service service) {
        services.add(service);
        System.out.println("Абонент " + name + " подписался на услугу: " + service.getName());
    }

    public void payBill(Bill bill) {
        bills.add(bill);
        bill.setPaid(true);
    }

    public String getName() {
        return name;
    }

    public List<Service> getServices() {
        return services;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
