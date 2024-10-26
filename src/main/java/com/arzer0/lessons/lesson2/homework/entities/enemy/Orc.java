package com.arzer0.lessons.lesson2.homework.entities.enemy;

import com.arzer0.lessons.lesson2.homework.entities.enums.*;
import com.arzer0.lessons.lesson2.homework.interfaces.Mortal;

public class Orc extends Enemy {
    private static final int BASE_DAMAGE = 8;

    public Orc(String name, Role role) {
        super(name, role, 100, 6, 0.2, 0.1, 0.1, Race.ORC, Faction.MONSTERS);
    }

    @Override
    public void attackEnemy(Mortal target) {
//        System.out.println(getName() + " атакует "+ target.getName() +" дубиной!");
        attackTarget(target, BASE_DAMAGE);
    }
}
