package com.arzer0.lessons.lesson2.homework.entities.enums.names;

import java.util.Random;

public enum DragonNames {
    SMOKE("Дым"),
    FLAME("Пламя"),
    IGNIS("Огник"),
    ZARA("Зара"),
    GLOW("Блеск"),
    ALARA("Алара"),
    THUNDER("Гром"),
    LUNA("Луна"),
    STORM("Шторм"),
    DAWN("Заря");

    private final String russianName;

    DragonNames(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public static String getRandomRussianName() {
        DragonNames[] values = DragonNames.values();
        Random random = new Random();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex].getRussianName();
    }
}