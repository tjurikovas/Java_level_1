package Lesson06;

import Lesson05.Coordinate;
import Lesson06.models.Actor;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 31.07.2021
 */

public class Player extends Actor {

    private int countSteps;
    private String name = "Vasia";

    public Player(String name, int healthPoint, int powerPoint, int positionX, int positionY) {
        super(name, powerPoint, healthPoint, positionX, positionY);
        this.countSteps = 0;
//        System.out.println("My name is " + this.name);
    }

    public Player(String name, int positionX, int positionY, int value) {
        super(name, positionX, positionY);
        this.countSteps = value;
    }

    public void moveUp() {
        positionY -= 1;
        ++countSteps;
        System.out.println("I move up. My posY " + positionY);
    }

    public void moveLeft() {
        positionX -= 1;
        ++countSteps;
        System.out.println("I move left. My posX " + positionX);
    }

    @Override
    public void run() {
        System.out.println("Player run");
    }


}
