package Lesson06;

import Lesson06.models.Actor;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 31.07.2021
 */

public class Enemy extends Actor {

    protected String type;

    public Enemy(String name, int positionX, int positionY, int healthPoint, int powerPoint,  String type) {
        super(name, powerPoint, healthPoint, positionX, positionY);
        this.type = type;
//        System.out.println("This is constructor Enemy");
    }

    public String getPosition() {
        return positionX + ":" + positionY;
    }

    @Override
    public void run() {
        System.out.println("Enemy run-run");
    }
}
