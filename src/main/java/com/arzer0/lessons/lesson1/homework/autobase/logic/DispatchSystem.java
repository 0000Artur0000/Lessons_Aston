package com.arzer0.lessons.lesson1.homework.autobase.logic;

import com.arzer0.lessons.lesson1.homework.autobase.model.Dispatcher;
import com.arzer0.lessons.lesson1.homework.autobase.model.Driver;
import com.arzer0.lessons.lesson1.homework.autobase.model.Route;
import com.arzer0.lessons.lesson1.homework.autobase.model.Vehicle;

import java.util.*;

public class DispatchSystem {

    private static List<Vehicle> vehiclesUnderRepair = new ArrayList<>();
    private static List<Vehicle> busyVehicles = new ArrayList<>();
    private Dispatcher dispatcher;

    public DispatchSystem(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public boolean assignRoute(Driver driver, Route route, Vehicle vehicle) {
        if (vehicle.isOperational() && !vehiclesUnderRepair.contains(vehicle) && !driver.isSuspended()) {
            busyVehicles.add(vehicle);
            driver.setRoute(route);
            driver.setVehicle(vehicle);
            System.out.println("Диспетчер "+ dispatcher.getName() +" назначил водителю " + driver.getName() + " рейс по маршруту " + route.getName() + " на автомобиле " + vehicle.getBrand());
            return true;
        } else {
            if (driver.isSuspended())
                System.out.println("Диспетчер "+ dispatcher.getName()+ ": Водитель " + driver.getName() + " отстранён.");
            else
                System.out.println("Диспетчер "+ dispatcher.getName()+ ": Автомобиль " + vehicle.getBrand() + " неисправен или уже назначен другому водителю.");
            return false;
        }
    }

    public Vehicle findAvailableVehicle(List<Vehicle> vehicleList){
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicleList) {
            if (!vehiclesUnderRepair.contains(vehicle) && !busyVehicles.contains(vehicle) && vehicle.isOperational()) {
                availableVehicles.add(vehicle);
            }
        }
        Random rand = new Random();
        if (availableVehicles.size() > 0)
            return availableVehicles.get(rand.nextInt(availableVehicles.size()));
        else
            return null;
    }

    public void releaseVehicle(Vehicle vehicle) {
        if (busyVehicles.contains(vehicle)) {
            busyVehicles.remove(vehicle);
            if (vehicle.isOperational())
                System.out.println("Автомобиль " + vehicle.getBrand() + " освобожден и готов к следующему рейсу.");
        }
    }

    public void suspendedDriver(Driver driver) {
        driver.setSuspended(true);
    }

    public void addVehicleForRepair(Vehicle vehicle) {
        vehiclesUnderRepair.add(vehicle);
        System.out.println("Диспетчер "+ dispatcher.getName()+ ": Автомобиль " + vehicle.getBrand() + " добавлен в список на ремонт.");
    }


}
