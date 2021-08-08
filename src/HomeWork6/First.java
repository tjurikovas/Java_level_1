package HomeWork6;

public class First {
    public static void main(String[] args) {
        Dog dog = new Dog("Naida", 505, 9, "typeDog");
        dog.abilityRun();
        dog.abilitySwim();

        Cat cat = new Cat("Pufik", 200, 999, "typeCat");
        cat.abilityRun();
        cat.abilitySwim();

        Cat cat1 = new Cat("Vasia", 155, 8, "typeCat");
        cat1.abilityRun();
        cat1.abilitySwim();
    }
}
