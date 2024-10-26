package com.arzer0.lessons.lesson2.homework.entities.enums.names;

import java.util.Random;

public enum HumanNames {
    ARTHUR("Артур"),
    LEONHARDT("Леонхардт"),
    CECILIA("Сесилия"),
    ALBERT("Альберт"),
    CHARLOTTE("Шарлотта"),
    FREDERIC("Фредерик"),
    LUCIA("Люсия"),
    ELEANOR("Элеонора"),
    GILBERT("Гилберт"),
    BEATRIX("Беатрис");

    private final String russianName;

    HumanNames(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public static String getRandomRussianName() {
        HumanNames[] values = HumanNames.values();
        Random random = new Random();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex].getRussianName();
    }
}


