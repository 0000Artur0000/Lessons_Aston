package com.arzer0.lessons.lesson1.homework.airport.model;

public class Plane {
    private final String model;
    private final int capacity;
    private final int range;

    public Plane(String model, int capacity, int range) {
        this.model = model;
        this.capacity = capacity;
        this.range = range;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRange() {
        return range;
    }
}
