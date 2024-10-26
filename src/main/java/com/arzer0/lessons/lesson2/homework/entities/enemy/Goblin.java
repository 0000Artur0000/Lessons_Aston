package com.arzer0.lessons.lesson2.homework.entities.enemy;

import com.arzer0.lessons.lesson2.homework.entities.enums.*;
import com.arzer0.lessons.lesson2.homework.interfaces.Mortal;

public class Goblin extends Enemy {
    private static final int BASE_DAMAGE = 5;

    public Goblin(String name, Role role) {
        super(name, role, 50, 3, 0.05, 0.2, 0.05, Race.GOBLIN, Faction.MONSTERS);
    }

    @Override
    public void attackEnemy(Mortal target) {
//        System.out.println(getName() + " атакует "+ target.getName() +" когтями!");
        attackTarget(target, BASE_DAMAGE);
    }
}
