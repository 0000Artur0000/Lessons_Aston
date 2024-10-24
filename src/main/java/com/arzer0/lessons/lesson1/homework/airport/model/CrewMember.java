package com.arzer0.lessons.lesson1.homework.airport.model;

public abstract class CrewMember {
    private final String name;

    public CrewMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getRole();
}
