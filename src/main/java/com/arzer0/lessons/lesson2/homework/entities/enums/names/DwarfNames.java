package com.arzer0.lessons.lesson2.homework.entities.enums.names;

import java.util.Random;

public enum DwarfNames {
    THORDIN("Тордин"),
    BRUNNA("Брунна"),
    GRENDOR("Грендор"),
    VARGINA("Варгина"),
    GARDIN("Гардин"),
    BELGA("Бельга"),
    DROMBUR("Дромбур"),
    MORGANA("Моргина"),
    FARLOK("Фарлок"),
    DILMA("Дильма");

    private final String russianName;

    DwarfNames(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public static String getRandomRussianName() {
        DwarfNames[] values = DwarfNames.values();
        Random random = new Random();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex].getRussianName();
    }
}
