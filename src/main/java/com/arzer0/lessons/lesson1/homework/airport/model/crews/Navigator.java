package com.arzer0.lessons.lesson1.homework.airport.model.crews;

public class Navigator extends CrewMember {
    public Navigator(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Штурман";
    }
}
