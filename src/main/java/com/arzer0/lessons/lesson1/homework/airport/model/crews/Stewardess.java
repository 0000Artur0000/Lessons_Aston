package com.arzer0.lessons.lesson1.homework.airport.model.crews;

import com.arzer0.lessons.lesson1.homework.airport.model.CrewMember;

public class Stewardess extends CrewMember {
    public Stewardess(String name) {
        super(name);
    }

    @Override
    public String getRole() {
        return "Стюардесса";
    }
}
