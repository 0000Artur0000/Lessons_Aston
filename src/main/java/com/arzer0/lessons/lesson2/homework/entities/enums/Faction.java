package com.arzer0.lessons.lesson2.homework.entities.enums;

public enum Faction {
    HUMANITY("Человечество"),
    MONSTERS("Монстры"),
    UNDEAD("Нежить"),
    DRAGONS("Драконы");

    private final String russianName;

    Faction(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}
