package com.arzer0.lessons.lesson2.homework;

import com.arzer0.lessons.lesson2.homework.battleground.BattleGround;
import com.arzer0.lessons.lesson2.homework.battleground.TrainingGround;
import com.arzer0.lessons.lesson2.homework.entities.enums.Faction;
import com.arzer0.lessons.lesson2.homework.interfaces.Attacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Attacker> entities = new ArrayList<>();
        for (int i = 0; i < rand.nextInt(10)+3; i++) {
            entities.add(TrainingGround.randomHero());
        }
        for (int i = 0; i < rand.nextInt(10)+3; i++) {
            entities.add(TrainingGround.randomEnemy());
        }
        for (int i = 0; i < rand.nextInt(6)+1; i++) {
            entities.add(TrainingGround.randomHero().transformToZombie());
        }
        System.out.println("Сейчас сражаются:");
        for(Faction faction: Faction.values()){
            int i = 0;

            for(Attacker attacker: entities){

                if (attacker.getFaction() == faction) {
                    i++;
                    if (i == 1)
                        System.out.println("  Фракция " + faction.getRussianName() + ":");
                    System.out.println("    " + attacker.getRole().getRussianName() +" "+ attacker.getRace().getRussianName() +  " " + attacker.getName());
                }
            }
        }
        System.out.println("-------------------------------------------------------");
        List<Attacker> initiativeOrder = BattleGround.determineInitiativeOrder(entities);
        BattleGround.startBattle(initiativeOrder);
    }
}
