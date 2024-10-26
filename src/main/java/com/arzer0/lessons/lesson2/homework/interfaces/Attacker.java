package com.arzer0.lessons.lesson2.homework.interfaces;

public interface Attacker extends Transformable {
    void attackEnemy(Mortal target);
    Attacker getKiller();
}
