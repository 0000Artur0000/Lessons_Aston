package com.arzer0.lessons.lesson2.homework.entities;

import com.arzer0.lessons.lesson2.homework.entities.enums.*;
import com.arzer0.lessons.lesson2.homework.interfaces.*;

import java.util.Random;

public class Zombie extends Entity implements Attacker {
    private static final int BASE_DAMAGE = 10;

    public Zombie(String name, int health, int defense, double critChance, double dodgeChance, double stealth, Race race) {
        super(name, Role.UNDEAD_WARRIOR, health, defense, critChance, dodgeChance, stealth, race, Faction.UNDEAD);
    }

    protected void attackTarget(Mortal target, int baseDamage) {
        if (target != null) {
            int crit = 0;
            Random random = new Random();
            if (getCritChance() > random.nextDouble()) {
                int roll = new Random().nextInt(20) + 1;
                crit = roll * baseDamage / 10;
            }
            double damage = baseDamage + crit;
            target.takeDamage(Math.max((int)damage, 0), this);
        }
    }

    @Override
    public void attackEnemy(Mortal target) {
//        System.out.println(getName() + " атакует "+ target.getName() +" когтями!");
        attackTarget(target, BASE_DAMAGE);
    }


}
