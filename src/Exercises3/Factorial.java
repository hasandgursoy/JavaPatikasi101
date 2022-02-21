package Exercises3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number,holder = 1;
        // Factoriyel Hesaplama Yapalım

        Scanner scn = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        number = scn.nextInt();

        for (int i = 1;i <=number;i++){

            holder = holder*i;
            System.out.println(holder);
        }

    }
}
