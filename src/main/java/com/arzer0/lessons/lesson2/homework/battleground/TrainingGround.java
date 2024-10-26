package com.arzer0.lessons.lesson2.homework.battleground;

import com.arzer0.lessons.lesson2.homework.entities.enemy.Enemy;
import com.arzer0.lessons.lesson2.homework.entities.enemy.Orc;
import com.arzer0.lessons.lesson2.homework.entities.enums.Role;
import com.arzer0.lessons.lesson2.homework.entities.hero.Hero;
import com.arzer0.lessons.lesson2.homework.entities.hero.Warrior;
import com.arzer0.lessons.lesson2.homework.entities.hero.Mage;
import com.arzer0.lessons.lesson2.homework.entities.hero.Archer;
import com.arzer0.lessons.lesson2.homework.entities.enemy.Goblin;
import com.arzer0.lessons.lesson2.homework.entities.enemy.Dragon;
import com.arzer0.lessons.lesson2.homework.entities.enums.Race;
import com.arzer0.lessons.lesson2.homework.interfaces.Attacker;
import com.arzer0.lessons.lesson2.homework.entities.enums.names.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrainingGround {
    public static void main(String[] args) {
        List<Attacker> entities = new ArrayList<>();
        entities.add(new Warrior("Никита", Role.WARRIOR, Race.HUMAN));
        entities.add(new Goblin("Гобуто", Role.WARRIOR ));
        List<Attacker> initiativeOrder = BattleGround.determineInitiativeOrder(entities);
        BattleGround.startBattle(initiativeOrder);
    }

    public static Hero randomHero(){
        Random random = new Random();
        Race race = Race.values()[random.nextInt(4)];
        String name = "";
        switch(race){
            case HUMAN:
                name = HumanNames.getRandomRussianName();
                break;
            case ELF:
                name = ElfNames.getRandomRussianName();
                break;
            case DWARF:
                name = DwarfNames.getRandomRussianName();
                break;
            case HOBBIT:
                name = HobbitNames.getRandomRussianName();
                break;
        };
        return switch (random.nextInt(3)) {
            case 0 -> new Warrior(name, Role.WARRIOR, race);
            case 1 -> new Archer(name, Role.ARCHER, race);
            case 2 -> new Mage(name, Role.MAGE, race);
            default -> null;
        };
    }
    public static Enemy randomEnemy(){
        Random random = new Random();
        Race race = Race.values()[random.nextInt(3)+4];
        String name = "";
        switch(race){
            case DRAGON:
                name = DragonNames.getRandomRussianName();
                return new Dragon( name, Role.BEAST);
            case ORC:
                name = OrcNames.getRandomRussianName();
                return new Orc(name, Role.WARRIOR);
            case GOBLIN:
                name = GoblinNames.getRandomRussianName();
                return new Goblin(name, Role.WARRIOR);
        }
        return null;
    }
}
