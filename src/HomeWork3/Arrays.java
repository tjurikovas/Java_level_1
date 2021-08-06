package HomeWork3;

public class Arrays {
    public static void main(String[] args) {

            int[] myArrayString = {1, 0, 0, 1, 1, 0, 0, 1, 0, 1}; // Task1

            for (int i = 0; i < myArrayString.length; i++) {

               if (myArrayString[i] == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
             System.out.println();
            System.out.println();

            int[] myArrayLong = new int[100];                  // Task2
            for (int i = 0; i < myArrayLong.length; i++) {
                myArrayLong[i] = i;
            }
            for (int i = 0; i < myArrayLong.length; i++) {
                System.out.print("meaning" + i + " ");
            }
            System.out.println();
            System.out.println();

            int[] myArrayComparison = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};  //Task3
                printArray(" Start", myArrayComparison);
                increase(myArrayComparison);
                printArray("Finich", myArrayComparison);

            System.out.println();

            int run = 12;                                                        //Task4
            int[][] myArraySquare = new int[run][run];
            diagonal(myArraySquare);
            printArrayTwo("Result:", myArraySquare);

            System.out.println();

            int[] hostIn = host(13, 578);                          //Task5
            printArray("host", hostIn);

            System.out.println();

            int[] myArray1 = {25, 29, 3, 5, 23, 45, 6, 7, 8, 9};            //Task6
            System.out.println("Min: " + minMax(myArray1));
            System.out.println("Max: " + maxMin(myArray1));
        }

    public static void printArray (String arr, int[] inputArray) {
        System.out.print(arr + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayTwo (String arr2, int[][] inputArray2) {
        System.out.println(arr2);
        for(int i = 0; i < inputArray2.length; i++) {
            for (int j = 0; j < inputArray2[i].length; j++) {
                System.out.print(inputArray2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void increase(int[] incr) {
        for (int i = 0; i < incr.length; i ++)
            if (incr[i] < 6)
            incr[i] *= 2;
    }

    public static void diagonal(int[][] diag) {
        for (int i = 0; i < diag.length; i ++) {
            diag[i][i] = 1;
            diag[i][diag.length - 1 - i] = 1;
        }
    }

    public static int [] host (int len, int initialValue){
        int[] temporary = new int[len];
        for(int i = 0; i < temporary.length; i++) {
            temporary[i] = initialValue;
        }
        return temporary;
    }

    public static int minMax (int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxMin (int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
