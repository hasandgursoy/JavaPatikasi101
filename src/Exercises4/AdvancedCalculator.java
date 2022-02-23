package Exercises4;

import java.util.Scanner;

public class AdvancedCalculator {

    static void sum(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void minus(double num1, double num2) {
        System.out.println(num1 - num2);
    }

    static void multiple(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    static void divide(double num1, double num2) {
        System.out.println(num1 / num2);
    }

    static void exponential(double base, double exp) {
        int temp = 1;
        for (int i = 1; i <= exp; i++) {
            temp *= base;
        }
        System.out.println(temp);
    }

    static void mod(double num1, double num2) {
        System.out.println(num1 % num2);
    }

    static void rectangle(double height, double width) {

        System.out.println("Alan :" + height * width);
        System.out.println("Çevre : " + ((2 * height) + (2 * width)));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int selector, num1, num2;
        boolean tempBoolean = true;
        String menu = "1.Topalama İşlemi\n" +
                "2.Çıkarma İşlemi\n" +
                "3.Çarpma İşlemi\n" +
                "4.Bölme İşlemi\n" +
                "5.Üslü Sayı Hesaplama\n" +
                "6.Mod Alma\n" +
                "7.Dikdörtgen Alan ve Çevre Hesaplama\n" +
                "0.Çıkış Yap";

        while (tempBoolean) {

            System.out.println(menu);
            System.out.print("Seçim No :");
            selector = scn.nextInt();
            if (selector == 0) {
                break;
            }
            System.out.println("Birinci Sayıyı Giriniz :");
            num1 = scn.nextInt();
            System.out.println("İkinci Sayıyı Giriniz :");
            num2 = scn.nextInt();

            switch (selector) {
                case 1 -> sum(num1, num2);
                case 2 -> minus(num1, num2);
                case 3 -> multiple(num1, num2);
                case 4 -> divide(num1, num2);
                case 5 -> exponential(num1, num2);
                case 6 -> mod(num1, num2);
                case 7 -> rectangle(num1, num2);
                case 0 -> tempBoolean = false;
            }

        }


    }

}
