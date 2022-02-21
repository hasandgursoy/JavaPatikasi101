package Exercises3;

import java.util.Scanner;

public class FindAndSumOddNumbers {
    public static void main(String[] args) {

        // Bu dersde garip birşey oldu scanner'a yazdığım sayıları videoyu durdurup önce ben denedim.
        // Algoritmayı kurdum inputları koydum vs. benim yazdığım tek sayıları hoca da yazdı :D Güzel bir tesadüf işin buraya düşer tebessüm et :D

        Scanner scn = new Scanner(System.in);
        int sum = 0,number;

        int i = 0;

        while (i >= 0){
            System.out.print("Sayi Giriniz :");
            number = scn.nextInt();
            if (number%2 ==1){
                sum += number;
            }else if(number < 0){
                i--;
            }
        }
        System.out.println("Toplam sayi :"+sum);

        // Do while ile olan halide var bu sefer int i tanımlamak yerine direk
        // değeri do'nun içinde isteyip sonra while'a tanımlıyosun.

    }
}
