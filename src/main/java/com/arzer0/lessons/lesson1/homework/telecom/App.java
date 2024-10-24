package com.arzer0.lessons.lesson1.homework.telecom;

import com.arzer0.lessons.lesson1.homework.telecom.logic.TelecomSystem;
import com.arzer0.lessons.lesson1.homework.telecom.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
Система Телефонная станция. Абонент оплачивает Счет за разговоры и Услуги,
может попросить Администратора сменить номер и отказаться от услуг. Администратор
изменяет номер, Услуги и временно отключает Абонента за неуплату.
*/

public class App {
    public static void main(String[] args) {
        List<Subscriber> subscribers = Arrays.asList(
                new Subscriber("Иван Иванов","7-111-111-11-11"),
                new Subscriber("Мария Петрова","7-111-111-11-12"),
                new Subscriber("Алексей Смирнов","7-111-111-11-13"),
                new Subscriber("Ольга Кузнецова","7-111-111-11-14"),
                new Subscriber("Дмитрий Соколов","7-111-111-11-15")
        );

        List<Service> services = Arrays.asList(
                new Service("Интернет"),
                new Service("Мобильная связь")
        );

        Administrator admin = new Administrator("Администратор");
        Random random = new Random();

        for (Subscriber subscriber : subscribers) {
            subscriber.subscribeService(services.get(0));
            subscriber.subscribeService(services.get(1));
            Bill bill = new Bill(1000);
            subscriber.payBill(bill);
            TelecomSystem.processPayment(subscriber, bill, admin);
            String newNumber = "7-111-" + (random.nextInt(900) + 100) + "-" + (random.nextInt(90) + 10) + "-" + (random.nextInt(90) + 10);
            admin.changeNumber(subscriber,newNumber);
            admin.disconnectSubscriber(subscriber);
        }
    }
}
