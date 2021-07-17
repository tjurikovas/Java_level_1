package Lesson01;

public class Lesson01 {


    //one-line comment

/*
multi-line comment
 */

    /**
     * JavaDoc
     * Created by Aleksandr Gladkov [Anticisco]
     * Date: 14.07.2021
     */


    public static void main(String[] args) {
//        System.out.print("Hello world"); //without new line
//        System.out.println("РџСЂРёРІРµС‚ РјРёСЂ"); //with new line
//        System.out.println("Ч©ЧњЧ•Чќ ЧўЧ•ЧњЧќ");
//        System.out.println("We study Java.");

//        String myString = "Hello Java!";
//        System.out.println(myString);
//        System.out.println(myString + " " + myString);// РєРѕРЅРєР°С‚РµРЅР°С†РёСЏ
//
//        //С†РµР»С‹Рµ С‡РёСЃР»Р°
//        byte myByte = 42; //-128..+127 (1 byte)
//        short myShort = 4200; //-32768..+32767 (2 byte)
//        int myInteger = 420000; //-2.1mlrd..+2.1mlrd (4 bytes) //Default
//        long myLong = 3500000000L; //-2^63..+2^63 (8 bytes)
//
//        //С‡РёСЃР»Р° СЃ С‚РѕС‡РєРѕР№
//        float myFloat = 15.459f; // (4 bytes) <>.0000000
//        double myDouble = 15.459; // (8 bytes) <>.00000000000000 //Default
//
        //СЃРёРјРІРѕР»С‹
//        char myChar = 'q'; //(2 bytes)
//        System.out.println(myChar + myFloat); //q15.459
//        System.out.println(myChar + String.valueOf(myFloat)); // Говорим Jawa оставь type string для переменной float

        //logic
//        boolean myBoolean = true; // = false; (1 byte)

        //+,-,*,/,%

//        int a = 15;
//        int b = 4;
//        int c = a % b;
//        System.out.println("Result " + c);
//
//        int a1 = 25;
//        int b1 = 4;
//        System.out.println(a1 / b1);
//
//        int c1 = 15;
//        c1 += 5;    //c1 = c1 + 5;
//        System.out.println(c1);

//        int abc = 20;
//
//        if (abc > 10) {
//            System.out.println("OK");
//        } else {
//            System.out.println("FAIL");
//        }
//
//        if (abc < 10) {
//            System.out.println("OK");
//        }

//        int b = 250;
//        if (b > 200) {
//            System.out.println("b > 200");
//        } else if (b > 20) {
//            System.out.println("b > 20");
//        } else {
//            System.out.println("FAIL");
//        }

        int a1 = 150;
        int a2 = 250;
        int result;

        result = myMath(a1, a2); //150+250 = 400
         a1++; // 151
        result = myMath(a1, a2); //151+250 = 401
        a2++; // 251
        result = myMath(a1, a2); //151+251 = 402
        a1++; // 152
        result = myMath(a1, a2); //152 + 251 = 403

        System.out.println("Result = " + result); //403




//        int cash = 1000;
//
//        int cashBack = goToShop1(cash);
//        System.out.println(cashBack);
//
//        System.out.println("------------");
//        goToShop2("Sergey");
//        goToShop2("Olga");
//        goToShop2("Elena");
//
//    }
//
//
//    public static int goToShop1(int cash) { // РІРѕР·РІСЂР°С‰Р°СЋС‰РёР№ С‚РёРї РјРµС‚РѕРґР°
//        System.out.println("go to shop");
//        System.out.println("buy something");
//        return cash - 100;
//    }
//
//    public static void goToShop2(String nameUser) { // РЅРёС‡РµРіРѕ РЅРµ РІРѕР·РІСЂР°С‰Р°СЋС‰РёР№ РјРµС‚РѕРґ
//        System.out.println(nameUser + " go to shop");
//        System.out.println(nameUser + " buy something");
    }
    public static int myMath(int valueA1, int valueA2) {
        return valueA1 - valueA2;
    }
}