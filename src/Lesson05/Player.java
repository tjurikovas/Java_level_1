package Lesson05.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 28.07.2021
 */

public class Player {

    public static int countLegs = 2;

    public int healthPoint;
    int powerPoint;
    int positionX;
    int positionY;
    Coordinate positionCoordinate;
    Coordinates coordinates = new Coordinates();
    int countSteps = 0;
    private String name; //class field's

    public Player() {

    }

    public Player(String name) {
         this.name = name;
    }

    public Player(int healthPoint, int powerPoint, int positionX, int positionY, int countSteps, String name) {
        this.healthPoint = healthPoint;
        this.powerPoint = powerPoint;
        this.positionX = positionX;
        this.positionY = positionY;
        this.countSteps = countSteps;
        this.name = name;
        positionCoordinate = new Coordinate();
    }

    public static void voice() {
        System.out.println("Hero voice");
    }

    private void speak() {
        System.out.println("Hello! My name is " + name);
    }

    private void calc() {
        powerPoint += 15 * healthPoint - positionX;
    }

    void moveUp() {
        positionY -=1;
        ++countSteps;
        System.out.println("I move up. My posY " + positionY);
    }

    void moveLeft() {
        positionX -=1;
        ++countSteps;
        System.out.println("I move left. My posX " + positionX);
    }

    public void giveDamage() {
        calc();
        System.out.println("My damage is " + powerPoint);
    }

    void takeDamage(int value) {
        healthPoint -= value;
        System.out.println("I take damage " + value + ". My hp now is " + healthPoint);
    }

    void healSelf(int value) {
        healthPoint += value;
        System.out.println(name + " heal self on " + value + ". HP now is " + healthPoint);
    }

    void changePosition(int x, int y) {
        positionCoordinate.x = x;
        positionCoordinate.y = y;
    }


    public class Coordinates {
        int x;
        int y;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
}
