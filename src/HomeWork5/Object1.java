package HomeWork5;

public class Object1 {
    public static void main(String[] args) {

//        Employee objectEmployee = new Employee("Петров Василий Генадиевич", "developer", "petrov@petr.ru", "+7(950)6543387", 55000, 36);
//        System.out.println("data employee : " + objectEmployee.salary);

    Employee1[] employeeArray = new Employee1[5];
    employeeArray[0] = new Employee1("Попов Владимир Александрович", "manager", "popov@pop.ru", "+4(35465)55431", 40000, 40);
    employeeArray[1] = new Employee1("Абросимов Генадий Ильич", "developer", "agi@roman.ru", "+4(15239)55431", 45000, 45);
    employeeArray[2] = new Employee1("Зюганов Генадий Владимирович", "janitor", "zgv@mail.ru", "+4(31235)55431", 30000, 25);
    employeeArray[3] = new Employee1("Круглов Борис Сергеевич", "developer", "krug@ro.ru", "+4(35465)55191", 80000, 43);
    employeeArray[4] = new Employee1("Арефьев Фёдор Агафонович", "director", "ar@ro.ru", "+4(35465)59731", 100000, 39);

}

}
