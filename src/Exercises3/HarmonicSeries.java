package Exercises3;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {

        // Harmonic series = 1 sayısının 1 den n 'e kadar bölünüp toplanmasına verilen ad.

        Scanner scn = new Scanner(System.in);

        System.out.print("N Sayısını Girinz :");
        int n = scn.nextInt();
        double result=0;

        for (int i = 1; i <=n ; i++){
            result += (1.0/i);
        }
        // 1.Döngü , i = 1; result = 0 + (1/1)
        // 2.Döngü , i = 2; result = 1 + (1/2)
        // 3.Döngü , i = 3; result = 2 + (1/3)
        // .... (n)
        System.out.println(result);

    }
}
