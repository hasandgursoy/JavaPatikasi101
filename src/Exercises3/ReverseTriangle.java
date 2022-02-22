package Exercises3;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Ters üçgen yapalım

        System.out.print("Basamak sayısı giriniz :");
        int n = scn.nextInt();

        int i, j, k;

        for (i = n; i > 0; i--) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k < (i * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
