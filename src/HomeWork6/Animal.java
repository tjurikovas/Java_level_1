package HomeWork6;

public class Animal {
    protected String name;
    protected int run;
    protected int swim;
    protected String type;
    protected int runMax;
    protected int swimMax;


    public Animal(String name, int run, int swim, String type) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.type = type;
    }

        protected void print(){
            System.out.println("Dog name: " + name + "\n" + "run:" + run + "\n" + "swim: " + swim);
    }

        protected void printRun() {
            System.out.println(name + " " + "может пробежать " + run + "м");
        }

        protected void printSwim() {
            System.out.println(name + " " + "может проплыть " + swim + "м");
        }

//    public void abilitySwim() {
//        if(type.equals("typeCat")) {
//            System.out.println(name + " является кошкой, а кошки не умеют плавать");
//        } else printSwim();
//    }

        protected void abilityRun() {
            if(run > runMax) {
                System.out.println(name + " не может пробежать " + run);
            } else printRun();
        }

        protected void abilitySwim() {
            if(swim > swimMax) {
                System.out.println(name + " не может проплыть " + swim);
            } else  printSwim();
        }

}
