package Exercises3;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        /* int a = 2451, basamakSayisi = 0,numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0

        while (a != 0){
            numberCounter++;
            a = a / 10;
        }

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        // Bir sayının son basamağını modunu 10 alarak buluyorsun.
        int b = 2451;
        int c = b % 10;*/

        Scanner scn = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = scn.nextInt();
        int bassNumber = 0;
        int tempNumber = number;
        int bassValue;
        int result = 0;
        int basPow = 1;

        while (tempNumber!=0){

            tempNumber /= 10;
            bassNumber++;

        }
        System.out.println("Basamak Number : "+tempNumber);

        tempNumber = number;
        while (tempNumber !=0){
            bassValue = tempNumber %10;
            basPow = 1;
            for (int i = 1; i  <= bassNumber;i++){
                basPow *= bassValue;

            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number){
            System.out.println(number + " Sayisi bir armstrong sayıdır.");
        }else {
            System.out.println("Armstrong sayı değildir.");
        }



    }
}
