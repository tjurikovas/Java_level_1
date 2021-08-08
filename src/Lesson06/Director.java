package Lesson06;

import Lesson06.models.Actor;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 31.07.2021
 */

public class Director {

    public static void main(String[] args) {

        Player player = new Player("Player", 100, 30, 10, 20);
        Enemy enemy = new Enemy("Enemy", 40, 30, 150, 40, "Troll");
        EnemyBoss boss = new EnemyBoss("Boss",98,99,1000,500, "Zombie");

//        player.healSelf(15, "value1");
//        enemy.healSelf(25, "value2");
//        boss.healSelf(30, "value3");

//        player.speak();
//        enemy.speak();
//        boss.speak();

//       Actor[] actorsArray = {player, enemy, boss};
//        for (int i = 0; i < actorsArray.length; i++) {
//            actorsArray[i].speak();
//            actorsArray[i].giveDamage();
//            actorsArray[i].takeDamage(60);
//            if (actorsArray[i] instanceof EnemyBoss) {
////                ((EnemyBoss)actorsArray[i]).superAttack();
//                EnemyBoss tmpBoss = (EnemyBoss) actorsArray[i];
//                tmpBoss.superAttack();
//            }
//        }

//        byte byte1 = 120;
//        int int1 = byte1;
//        System.out.println("int1 > " + int1);
//
//        int int2 = 120120; //-128..+127 - 2^n
//        byte byte2 = (byte) int2; //type casting
//        System.out.println("byte2 > " + byte2);

//        Actor actor = new Actor("Value1", 10, 20);
//        player.speak();
//        player.moveUp();
//        player.giveDamage();

//        Player playerTest = new Player("Player Test", 99,88, 150);
//        playerTest.speak();
//        playerTest.takeDamage(40);
//
//        System.out.println("enemy.getPosition() > " + enemy.getPosition());
//        enemy.giveDamage();
//        enemy.takeDamage(30);
//        enemy.speak();

        int a1 = 15;
        byte abc1 = 120;
        float b1 = 16.5f;
        String s1 = "Hello";
        Player player1 = new Player("Player1", 100, 30, 10, 20);

        Object[] myObjArray = {a1, b1, s1, player1, abc1};
        for (int i = 0; i < myObjArray.length; i++) {
            if (myObjArray[i] instanceof Byte) {
                System.out.println(((Byte) myObjArray[i]).toString());
            }
        }



    }
}
