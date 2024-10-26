package com.arzer0.lessons.lesson2.homework.entities.enemy;

import com.arzer0.lessons.lesson2.homework.entities.enums.*;
import com.arzer0.lessons.lesson2.homework.interfaces.Mortal;

public class Dragon extends Enemy {
    private static final int BASE_DAMAGE = 50;

    public Dragon(String name, Role role) {
        super(name, role, 150, 5, 0.03, 0.01, 0.08, Race.DRAGON, Faction.DRAGONS);
    }

    @Override
    public void attackEnemy(Mortal target) {
//        System.out.println(getName() + " атакует "+ target.getName() +" огненным дыханием!");
        attackTarget(target, BASE_DAMAGE);
    }

}
