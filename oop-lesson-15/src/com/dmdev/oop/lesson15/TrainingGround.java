package com.dmdev.oop.lesson15;

public class TrainingGround {

    public static void main(String[] args) {
        Hero warrior = new Warrior("Боромір", 15);
        Hero mage = new Mage("Гендальф", 20);
        Hero archer = new Archer("Леголас", 10);

        Enemy enemy = new Enemy("Зомбі", 100);

        attackEnemy(enemy, mage, warrior, archer);
        attackEnemy2(enemy, mage, warrior, archer);
    }

    public static void attackEnemy2(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }

    
    
    
    
    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}