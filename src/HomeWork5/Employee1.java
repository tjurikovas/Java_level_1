package HomeWork5;

public class Employee1 {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee1(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
//        print();
        printArray();
    }

    public void print() {
        System.out.println("Name: " + fullName + "\n" + "position: " + position  + "\n" + "email: " + email + "\n" + "phone: " + phoneNumber  + "\n" + "salary: " + salary + "\n" + "age: " + age);
        System.out.println("===========");
    }

    public void printArray() {
        if(age > 40) {System.out.println("Name: " + fullName + "\n" + "position: " + position  + "\n" + "email: " + email + "\n" + "phone: " + phoneNumber  + "\n" + "salary: " + salary + "\n" + "age: " + age);
            System.out.println("===========");}
    }
}
