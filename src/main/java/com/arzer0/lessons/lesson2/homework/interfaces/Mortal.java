package com.arzer0.lessons.lesson2.homework.interfaces;

import com.arzer0.lessons.lesson2.homework.entities.enums.*;

public interface Mortal {
    boolean isAlive();
    void takeDamage(int damage);
    void takeDamage(int damage, Attacker attacker);
    int rollInitiative();
    Faction getFaction();
    int getHealth();
    String getName();
    Role getRole();
    Race getRace();

}
