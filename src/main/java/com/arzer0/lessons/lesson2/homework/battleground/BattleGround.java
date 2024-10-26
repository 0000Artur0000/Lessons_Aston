package com.arzer0.lessons.lesson2.homework.battleground;

import com.arzer0.lessons.lesson2.homework.entities.Zombie;
import com.arzer0.lessons.lesson2.homework.entities.enums.Faction;
import com.arzer0.lessons.lesson2.homework.interfaces.Attacker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BattleGround {


    public static List<Attacker> determineInitiativeOrder(List<Attacker> entities) {
        entities.sort(Comparator.comparingInt(Attacker::rollInitiative).reversed());
        return entities;
    }

    public static void startBattle(List<Attacker> entities) {
        if (isOneFactionRemaining(entities)) {
            System.out.println("Фракция " + entities.get(0).getFaction().getRussianName() + " победила!");
            System.out.println(entities.get(0).getFaction().getRussianName() + ":");
            for (Attacker winner : entities) {
                System.out.println("   " + winner.getRole().getRussianName() + " "+ winner.getRace().getRussianName() + " " + winner.getName());
            }
            return;
        }

        List<Attacker> newEntities = new ArrayList<>();
        for (Attacker entity : entities) {
            if (!entity.isAlive()) {
                if (entity.getKiller() != null && entity.getKiller().getFaction().equals(Faction.UNDEAD)) {
                    Zombie zombie = entity.transformToZombie();
                    newEntities.add(zombie);
                    continue;
                }
            }

            Attacker target = findTarget(entity, entities);
            if (target != null) {
                entity.attackEnemy(target);
            }
        }
        for (Attacker entity : entities) {
            if (entity.isAlive()) {
                newEntities.add(entity);
            }
        }
        startBattle(determineInitiativeOrder(newEntities));
    }

    private static Attacker findTarget(Attacker attacker, List<Attacker> entities) {
        for (Attacker entity : entities) {
            if (entity.isAlive() && entity.getFaction() != attacker.getFaction()) {
                return entity;
            }
        }
        return null;
    }

    private static boolean isOneFactionRemaining(List<Attacker> entities) {
        if (entities.size() < 2) {
            return true;
        }
        Faction remainingFaction = entities.get(1).getFaction();
        for (Attacker entity : entities) {
            if (entity.isAlive()) {
                if (remainingFaction != entity.getFaction()) {
                    return false;
                }
            }
        }
        return true;
    }
}
