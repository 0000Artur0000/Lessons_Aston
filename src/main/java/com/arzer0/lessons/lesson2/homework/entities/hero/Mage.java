package com.arzer0.lessons.lesson2.homework.entities.hero;

import com.arzer0.lessons.lesson2.homework.entities.enums.*;
import com.arzer0.lessons.lesson2.homework.interfaces.Mortal;

public class Mage extends Hero {
    private static final int BASE_DAMAGE = 15;

    public Mage(String name, Role role, Race race) {
        super(name, role, 80, 5, 0.2, 0.05, 0.2, race);
    }

    @Override
    public void attackEnemy(Mortal target) {
//        System.out.println(getName() + " атакует "+ target.getName() +" магией!");
        attackTarget(target, BASE_DAMAGE);
    }
}
