package com.arzer0.lessons.lesson2.homework.entities.enums.names;

import java.util.Random;

public enum ElfNames {
    ALINDOR("Алиндор"),
    LIANA("Лиана"),
    FAELDOR("Фаэльдор"),
    ERIANA("Эриана"),
    TAELDAN("Таэльдан"),
    LESANA("Лесана"),
    NIANDOR("Ниандор"),
    FILANA("Филана"),
    RIANDAR("Риандар"),
    VIANNA("Вианна");

    private final String russianName;

    ElfNames(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public static String getRandomRussianName() {
        ElfNames[] values = ElfNames.values();
        Random random = new Random();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex].getRussianName();
    }
}
