package Exercises3;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Mükemmel Sayı Bulma

        System.out.print("Bir sayı giriniz : ");
        int n = scn.nextInt();
        int sum = 0;
        for (int i = 1; i < n;i++){

            if (n %i == 0){
                sum += i;
            }

        }

        if (sum == n){
            System.out.println(sum+" : Mükemmel sayidir");
        }else {
            System.out.println("Mükemmel sayı değildir.");
        }

    }
}
