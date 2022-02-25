package Exercises7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Random Sayı Üretmek İçin 1. Yöntem
        // Type Casting
        double number =(int) (Math.random() * 100);
        System.out.println(number);

        // Random Sınıfı
        Random rand = new Random();
        int randNumber = rand.nextInt(100);

        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;

        System.out.println(randNumber);
        while (right < 5){
            System.out.print("Lütfen tahmininizi giriniz :");
            selected = scn.nextInt();

            if (selected < 0 || selected >100){
                System.out.println("Girdiğiniz Sayı 0-100 arası olmalıdır !!!");
                continue;
            }

            if (selected == randNumber){
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğin sayı :"+number);
                isWin = true;
                break;
            }else {
                wrong[right] = selected;
                right++;
                System.out.println("Yanlış Tahmin :D");
                if (selected > randNumber){
                    System.out.println("Tahminniz gizli sayıdan büyüktür. :D");
                }else  {
                    System.out.println("Tahmininz gizli sayıdan küçüktür. :D");
                }
                System.out.println("Kalan Hakkı :"+(5-right));

            }

        }
        if (isWin){
            System.out.println("Kazandınız !!!!");
        }else {
            System.out.println("Kaybettiniz !!!");
        }
        System.out.println("Yanlış Girdiğiniz Cevaplar :"+Arrays.toString(wrong));



    }
}
