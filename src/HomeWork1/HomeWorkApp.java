package HomeWork1;

public class HomeWorkApp {
    public static void main(String[] args) {

//       Task2

        printThreeWords();

        System.out.println("******");

        //          Task3

        if (checkSumSign() > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

        System.out.println("******");

        //   Task4

        if (printColor() <= 0) {
            System.out.println("Красный");
        } else if (printColor() > 0 && printColor() <= 100) {
            System.out.println("Желтый");
        } else if (printColor() > 100) {
            System.out.println("Зеленый");
        }

        System.out.println("******");

        //  Task5

        if (compareNumbers() == 1) {
            System.out.println("a >= b");
        } else if (compareNumbers() == 2) {
            System.out.println("a < b");
        }

    }

        public static void printThreeWords() {
            System.out.println("Orange \nBanana \nApple");
        }


        public static int checkSumSign() {
            int a = 125;
            int b = -1459;
            return a + b;
            }


        public static int printColor() {
            int value = 98;
            return value;
        }


        public static int compareNumbers() {
            int a = 137, b = 137;
            int result;
            if (a >= b) {
                result = 1;
            } else {
            result = 2;
            }
            return result;
        }
    }