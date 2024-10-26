package com.arzer0.lessons.lesson2.homework.entities.enums;

public enum Race {
    HUMAN("Человек"),
    ELF("Эльф"),
    DWARF("Гном"),
    HOBBIT("Хоббит"),
    ORC("Орк"),
    GOBLIN("Гоблин"),
    DRAGON("Дракон");

    private final String russianName;

    Race(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}
