package com.arzer0.lessons.lesson2.homework.entities.enums.names;

import java.util.Random;

public enum GoblinNames {
    SNIK("Сник"),
    BOKKA("Бокка"),
    RIGG("Ригг"),
    GUTTA("Гутта"),
    TRING("Тринг"),
    ZARKA("Зарка"),
    SKRIK("Скрик"),
    GLITTA("Глитта"),
    GRUMP("Грамп"),
    TARKA("Тарка");

    private final String russianName;

    GoblinNames(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public static String getRandomRussianName() {
        GoblinNames[] values = GoblinNames.values();
        Random random = new Random();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex].getRussianName();
    }
}
