package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {


        System.out.println(twoNumbers(9, 12));  //Task 1

        System.out.println("********");

        positiveNumbers(-17);  //Task 2

        System.out.println("********");

        System.out.println(trueFalse(48));  //Task 3

        System.out.println("********");

        printString("Hello Java!", 7);  //Task 4

        System.out.println("********");

        System.out.println(leapYear(2000));  //Task 5

    }

    public static boolean twoNumbers(int a, int b) {   //Task 1
        boolean c;
       if ((a + b) >= 10 && (a + b) <= 20) {
           c = true;
        } else {
           c = false;
       }
            return c;
        }

        public static void positiveNumbers(int a) {  //Task 2
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        }

        public static boolean trueFalse(int a) {  //Task 3
            return a > 0;
        }

        public static void printString(String str, int b) {   //Task 4
            for (int i = 1; i <= b; i++) {
                System.out.println(str + "-" + i);
            }
        }

        public static boolean leapYear(int a) {  //Task 5
            boolean d;
            if((a % 400) == 0) {
                d = true;
            } else if((a % 100) == 0) {
                d = false;
            } else if((a % 4) == 0) {
                d = true;
            } else {
                d = false;
            }
            return d;
        }
    }


