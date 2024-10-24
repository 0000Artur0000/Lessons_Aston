package com.arzer0.lessons.lesson1.homework.autobase;

import com.arzer0.lessons.lesson1.homework.autobase.logic.DispatchSystem;
import com.arzer0.lessons.lesson1.homework.autobase.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        List<Driver> drivers = Arrays.asList(
                new Driver("Айдар Сафин"),
                new Driver("Рушан Бакиев"),
                new Driver("Фанис Нуриев"),
                new Driver("Гульназ Хамитова"),
                new Driver("Зуфар Габдрахманов")
        );

        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle("Лейсян A500", "LXY1234567890A500", true),
                new Vehicle("Чанъань E300", "CHN0987654321E300", true),
                new Vehicle("Хавал F7", "HVL1122334455F700", true)
        );

        List<Route> routes = Arrays.asList(
                new Route("Проспект Октября"),
                new Route("Улица Ленина"),
                new Route("Сипайлово"),
                new Route("Затон"),
                new Route("Дема")
        );
        Dispatcher dispatcher = new Dispatcher("Сергей Викторович");
        DispatchSystem dispatchSystem = new DispatchSystem(dispatcher);

        Random random = new Random();
        for (int i=0; i<5;i++) {
            Driver driver = drivers.get(random.nextInt(drivers.size()));
            if (driver.isSuspended())
            {
                System.out.println("Диспетчер "+ dispatcher.getName()+ ": Водитель " + driver.getName() + " отстранён.");
                continue;
            }
            Route route = routes.get(random.nextInt(routes.size()));
            Vehicle vehicle = dispatchSystem.findAvailableVehicle(vehicles);
            if (vehicle != null) {
                if (dispatchSystem.assignRoute(driver, route, vehicle)) {
                    driver.completeRoute(route, vehicle);
                    boolean isVehicleOperational = driver.checkVehicleStatus(vehicle, random.nextBoolean());
                    if (!isVehicleOperational) {
                        driver.requestRepair(vehicle, dispatchSystem);
                    }
                    dispatchSystem.releaseVehicle(vehicle);
                    if (random.nextBoolean())
                        dispatchSystem.suspendedDriver(driver);
                }
            } else {
                System.out.println("Нет доступных исправных машин для водителя " + driver.getName());
            }
        }
    }
}
