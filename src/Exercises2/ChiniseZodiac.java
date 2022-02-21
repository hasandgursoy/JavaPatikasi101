package Exercises2;

import java.util.Scanner;

public class ChiniseZodiac {
    public static void main(String[] args) {
        int bornDate,zodiac;
        String animal ="";
        Scanner scn = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz :");
        bornDate = scn.nextInt();
        zodiac = bornDate %12;


        switch (zodiac) {
            case 0 -> animal = "Maymun";
            case 1 -> animal = "Horoz";
            case 2 -> animal = "Köpek";
            case 3 -> animal = "Domuz";
            case 4 -> animal = "Fare";
            case 5 -> animal = "Öküz";
            case 6 -> animal = "Kaplan";
            case 7 -> animal = "Tavşan";
            case 8 -> animal = "Ejderha";
            case 9 -> animal = "Yılan";
            case 10 -> animal = "At";
            case 11 -> animal = "Koyun";
        }

        System.out.println("Çin Zodiac'ına göre sizin burcunuz : "+animal);


    }
}
