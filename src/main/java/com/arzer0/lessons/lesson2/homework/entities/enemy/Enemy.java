package com.arzer0.lessons.lesson2.homework.entities.enemy;

import com.arzer0.lessons.lesson2.homework.entities.Entity;
import com.arzer0.lessons.lesson2.homework.entities.enums.*;
import com.arzer0.lessons.lesson2.homework.interfaces.*;

import java.util.Random;

public abstract class Enemy extends Entity implements Attacker {
    public Enemy(String name, Role role, int health, int defense, double critChance, double dodgeChance, double stealth, Race race, Faction faction) {
        super(name, role, health, defense, critChance, dodgeChance, stealth, race, faction);
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
}
