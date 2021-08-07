package Lesson06.models;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 31.07.2021
 */

public abstract class Actor {

    protected String name;
    protected int powerPoint;
    protected int healthPoint;
    protected int positionX;
    protected int positionY;

    public Actor(String name, int powerPoint, int healthPoint, int positionX, int positionY) {
        this.name = name;
        this.powerPoint = powerPoint;
        this.healthPoint = healthPoint;
        this.positionX = positionX;
        this.positionY = positionY;
//        System.out.println("This is constructor Actor");
    }

    public Actor(String name, int positionX, int positionY) {
        this.name = name;
        this.powerPoint = 30;
        this.healthPoint = 50;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void giveDamage() {
        System.out.println(name + " give damage " + powerPoint + " point");
    }

    public void takeDamage(int value) {
        healthPoint -= value;
        System.out.println("I take damage " + value + " point. My HP " + healthPoint);
    }

    public void speak() {
        System.out.println("Hello! My name is " + name);
    }

    public void healSelf(int value, String somethingValue) {
        healthPoint += value;
        System.out.println(name + " heal self on " + value + ". HP now is " + healthPoint);
    }

    public abstract void run();

}
