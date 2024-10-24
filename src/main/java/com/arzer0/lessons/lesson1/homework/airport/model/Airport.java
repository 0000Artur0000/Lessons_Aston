package com.arzer0.lessons.lesson1.homework.airport.model;

public class Airport {
    private final String name;
    private final String location;
    private final boolean isWeatherGood;

    public Airport(String name, String location, boolean isWeatherGood) {
        this.name = name;
        this.location = location;
        this.isWeatherGood = isWeatherGood;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean isWeatherGood() {
        return isWeatherGood;
    }
}
