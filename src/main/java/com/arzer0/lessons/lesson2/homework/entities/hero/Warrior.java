package com.arzer0.lessons.lesson2.homework.entities.hero;

import com.arzer0.lessons.lesson2.homework.entities.enums.*;
import com.arzer0.lessons.lesson2.homework.interfaces.Mortal;

public class Warrior extends Hero {
    private static final int BASE_DAMAGE = 10;

    public Warrior(String name, Role role, Race race) {
        super(name, role, 100, 15, 0.1, 0.1, 0.3, race);
    }

    @Override
    public void attackEnemy(Mortal target) {
//        System.out.println(getName() + " атакует "+ target.getName() +" мечом!");
        attackTarget(target, BASE_DAMAGE);
    }
}

