package com.arzer0.lessons.lesson1.homework.telecom.model;

public class Administrator {
    private final String name;

    public Administrator(String name) {
        this.name = name;
    }

    public void changeNumber(Subscriber subscriber, String newNumber) {
        subscriber.setPhoneNumber(newNumber);
        System.out.println("Администратор "+name+": Абонент " + subscriber.getName() + " сменил номер на: " + newNumber);
    }

    public void disconnectSubscriber(Subscriber subscriber) {
        System.out.println("Администратор "+name+": Абонент " + subscriber.getName() + " временно отключен.");
    }

    public void reconnectSubscriber(Subscriber subscriber) {
        System.out.println("Администратор "+name+": Абонент " + subscriber.getName() + " снова подключен.");
    }
}
