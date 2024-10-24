package com.arzer0.lessons.lesson1.homework.autobase.model;

import com.arzer0.lessons.lesson1.homework.autobase.logic.DispatchSystem;

public class Driver {
    private final String name;
    private Route route;
    private Vehicle vehicle;
    private boolean isSuspended;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public void completeRoute(Route route, Vehicle vehicle) {
        if (!isSuspended) {
            System.out.println("Водитель " + name + " завершил рейс по маршруту " + route.getName() + " на автомобиле " + vehicle.getBrand());
        } else {
            System.out.println("Водитель " + name + " отстранен и не может выполнить рейс.");
        }
    }

    public boolean checkVehicleStatus(Vehicle vehicle, boolean isInGoodCondition) {
        vehicle.setOperational(isInGoodCondition);
        String status = isInGoodCondition ? "в хорошем состоянии" : "требует ремонта";
        System.out.println("Водитель " + name + " отметил, что автомобиль " + vehicle.getBrand() + " " + status);
        return isInGoodCondition;
    }

    public void requestRepair(Vehicle vehicle, DispatchSystem dispatcherSystem) {
        if (!vehicle.isOperational()) {
            dispatcherSystem.addVehicleForRepair(vehicle);
        } else {
            System.out.println("Автомобиль " + vehicle.getBrand() + " не требует ремонта.");
        }
    }
}
