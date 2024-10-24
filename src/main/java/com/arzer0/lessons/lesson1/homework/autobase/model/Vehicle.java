package com.arzer0.lessons.lesson1.homework.autobase.model;

import java.util.Objects;

public class Vehicle {
    private final String brand;
    private final String vin;
    private boolean isOperational;

    public Vehicle(String brand, String vin, boolean isOperational) {
        this.brand = brand;
        this.vin = vin;
        this.isOperational = isOperational;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return vin.equals(vehicle.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }
}
