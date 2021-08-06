package HomeWork6;

public class Dog extends Animal{

    public Dog(String name, int run, int swim, String type) {
        super(name, run, swim, type);
        this.name = name;
        this.run = run;
        this.swim = swim;
        runMax = 500;
        swimMax = 10;
    }

}
