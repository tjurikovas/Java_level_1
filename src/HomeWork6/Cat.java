package HomeWork6;

public class Cat extends Animal{

    public Cat(String name, int run, int swim, String type) {
        super(name, run, swim, type);
        this.name = name;
        this.run = run;
        this.swim = swim;
        runMax = 200;
    }

    @Override
    protected void abilitySwim() {System.out.println(name + " является кошкой, а кошки не умеют плавать");}
    }
