package com.arzer0.lessons.lesson2.homework.entities.enums.names;

import java.util.Random;

public enum OrcNames {
    GROK("Грок"),
    MAGRA("Магра"),
    TORG("Торг"),
    SHAGRA("Шагра"),
    UGRAN("Угран"),
    ZORGA("Зорга"),
    DRAK("Драк"),
    MURGA("Мурга"),
    GRUNT("Грунт"),
    SHAGURA("Шагура");

    private final String russianName;

    OrcNames(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public static String getRandomRussianName() {
        OrcNames[] values = OrcNames.values();
        Random random = new Random();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex].getRussianName();
    }
}
