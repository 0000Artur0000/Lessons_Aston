package com.arzer0.lessons.lesson1.homework.airport.model.crews;

public class Stewardess extends CrewMember {
    public Stewardess(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Стюардесса";
    }
}
