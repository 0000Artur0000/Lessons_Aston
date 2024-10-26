package com.arzer0.lessons.lesson2.homework.entities.hero;

import com.arzer0.lessons.lesson2.homework.entities.enums.*;
import com.arzer0.lessons.lesson2.homework.interfaces.Mortal;

public class Archer extends Hero {
    private static final int BASE_DAMAGE = 12;

    public Archer(String name, Role role, Race race) {
        super(name, role,90, 8, 0.15, 0.3, 0.6, race);
    }

    @Override
    public void attackEnemy(Mortal target) {
//        System.out.println(getName() + " выстрелил в "+ target.getName() +"!");
        attackTarget(target, BASE_DAMAGE);
    }
}
