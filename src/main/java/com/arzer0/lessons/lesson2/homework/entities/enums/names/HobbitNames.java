package com.arzer0.lessons.lesson2.homework.entities.enums.names;

import java.util.Random;

public enum HobbitNames {
    BILLYG("Биллиг"),
    DONNY("Донни"),
    RORRY("Рорри"),
    MILLY("Милли"),
    TOMMY("Томми"),
    LILLY("Лилли"),
    GARRICK("Гаррик"),
    DORRY("Дорри"),
    FILLIG("Филлинг"),
    LOTTY("Лотти");

    private final String russianName;

    HobbitNames(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public static String getRandomRussianName() {
        HobbitNames[] values = HobbitNames.values();
        Random random = new Random();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex].getRussianName();
    }
}

