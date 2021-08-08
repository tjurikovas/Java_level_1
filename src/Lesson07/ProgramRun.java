package Lesson07;

import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 04.08.2021
 */

public class ProgramRun extends Object {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String s0 = "Hello_world!";
//        String s1 = "Hello_";
//        s1 += "world!"; //"Hello_world!"
//        String s2 = scanner.nextLine();
//        String s3 = "Hello_world!";
//
//        System.out.println("s0 > " + s0);
//        System.out.println("s1 > " + s1);
//        System.out.println("s2 > " + s2);
//        System.out.println("s3 > " + s3);
//        System.out.println("*****");
//        System.out.println("s0 = s1? " + (s0 == s1));
//        System.out.println("s0 = s2? " + (s0 == s2));
//        System.out.println("s0 = s3? " + (s0 == s3));
//        System.out.println("*****");
//        System.out.println("s0 = s1? " + (s0.equals(s1)));
//        System.out.println("s0 = s1? " + (s0.equals(s2)));
//        System.out.println("s0 = s1? " + (s0.equals(s3)));

//        int[] v1 = {1};
//        System.out.println(v1);

        String testString = "Test"; //String testString = new String("Test");
        StringBuilder stringBuilder = new StringBuilder("Test");
        StringBuffer stringBuffer = new StringBuffer("Test");

        long startTime = System.nanoTime(); // timestamp UNIX

        for (int i = 0; i < 50000; i++) {
            testString += i; //Test0123456578910...49999
        }

        float deltaTime = System.nanoTime() - startTime;
        System.out.println(testString);
        System.out.println("Time test string = " + deltaTime * 0.000001f + " millisec.");

        startTime = System.nanoTime();

        for (int i = 0; i < 50000 ; i++) {
            stringBuilder.append(i);
        }

        deltaTime = System.nanoTime() - startTime;
        System.out.println(stringBuilder.toString());
        System.out.println("Time test stringBuilder = " + deltaTime * 0.000001f + " millisec.");
        System.out.println(testString.equals(stringBuilder.toString()));

    }
}
