package com.arzer0.lessons.lesson2.homework.entities.enums;

public enum Role {
    WARRIOR("Воин"),
    MAGE("Маг"),
    ARCHER("Лучник"),
    BEAST("Зверь"),
    UNDEAD_WARRIOR("Воин смерти");

    private final String russianName;

    Role(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}
