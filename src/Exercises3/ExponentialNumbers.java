package Exercises3;

import java.util.Scanner;

public class ExponentialNumbers {

    public static void main(String[] args) {

        // Girilen sayıdan küçük 2'nin kuvvetlerini bulan program yazalım.
        int inp;
        Scanner scn = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        inp = scn.nextInt();
        for (int i = 1; i <= inp; i=i*2){

            System.out.println(i);
        }

    }



}
