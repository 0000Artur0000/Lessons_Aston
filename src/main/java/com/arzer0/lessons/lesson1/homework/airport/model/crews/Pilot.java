package com.arzer0.lessons.lesson1.homework.airport.model.crews;

public class Pilot extends CrewMember {
    public Pilot(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Пилот";
    }
}

