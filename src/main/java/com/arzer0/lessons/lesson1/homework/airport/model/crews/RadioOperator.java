package com.arzer0.lessons.lesson1.homework.airport.model.crews;

public class RadioOperator extends CrewMember {
    public RadioOperator(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Радист";
    }
}
