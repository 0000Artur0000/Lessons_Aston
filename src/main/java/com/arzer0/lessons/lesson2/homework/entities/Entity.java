package com.arzer0.lessons.lesson2.homework.entities;

import com.arzer0.lessons.lesson2.homework.entities.enums.*;
import com.arzer0.lessons.lesson2.homework.interfaces.*;

import java.util.Random;

public abstract class Entity implements Transformable {
    private String name;
    private Role role;
    private int health;
    private int maxHealth;
    private int defense;
    private double critChance;
    private double dodgeChance;
    private double stealth;
    private Race race;
    private Faction faction;
    private Attacker killer;


    public Entity(String name, Role role, int health, int defense, double critChance, double dodgeChance, double stealth, Race race, Faction faction) {
        this.name = name;
        this.role = role;
        this.health = health;
        this.maxHealth = health;
        this.defense = defense;
        this.critChance = critChance;
        this.dodgeChance = dodgeChance;
        this.stealth = stealth;
        this.race = race;
        this.faction = faction;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public Attacker getKiller() {
        return killer;
    }

    @Override
    public Race getRace() {
        return race;
    }

    @Override
    public Faction getFaction() {
        return faction;
    }

    public double getCritChance() {
        return critChance;
    }

    @Override
    public int rollInitiative() {
        double roll = new Random().nextInt(20) + 1 + stealth*10;
        return (int) roll;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void takeDamage(int damage) {
        if (new Random().nextDouble() < dodgeChance) {
//            System.out.println(name + " увернулся от атаки!");
            return;
        }
        int finalDamage = Math.max(0, damage - defense);
        health -= finalDamage;
//        System.out.println(name + " получает " + finalDamage + " урона, текущее здоровье: " + health);
    }

    @Override
    public void takeDamage(int damage, Attacker attacker){
        takeDamage(damage);
        if (!this.isAlive()){
            System.out.println(attacker.getName() + " убивает " + name + "!");
            killer = attacker;
        }

    }

    @Override
    public Zombie transformToZombie() {

        return new Zombie(name, maxHealth, defense, critChance, dodgeChance, stealth, race);

    }

}
