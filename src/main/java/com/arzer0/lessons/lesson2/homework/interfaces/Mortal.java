package com.arzer0.lessons.lesson2.homework.interfaces;

import com.arzer0.lessons.lesson2.homework.entities.enums.*;

public interface Mortal {
    boolean isAlive();
    void takeDamage(int damage);
    void takeDamage(int damage, Attacker attacker);
    int rollInitiative();
    Faction getFaction();
    String getName();
    Role getRole();
    Race getRace();
    Attacker getKiller();
}
