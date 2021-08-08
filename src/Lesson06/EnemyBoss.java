package Lesson06;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 31.07.2021
 */

public class EnemyBoss extends Enemy {

    public EnemyBoss(String name, int positionX, int positionY, int healthPoint, int powerPoint, String type) {
        super(name, positionX, positionY, healthPoint, powerPoint, type);
//        System.out.println("This is constructor EnemyBoss");
    }

    @Override
    public void healSelf(int value, String somethingValue) {
        super.speak();
        System.out.println("Sorry, heal boss disabled");
    }

    public void superAttack() {
        System.out.println("Super Attack");
    }




}
