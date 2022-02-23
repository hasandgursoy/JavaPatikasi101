package Exercises4;

import java.util.Scanner;

public class RecursivePatternCreate {

    static void pattern(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        }

        System.out.print(num + " ");
        pattern(num - 5);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Sayi Giriniz :");
        int num = scn.nextInt();

        pattern(25);


    }

}
