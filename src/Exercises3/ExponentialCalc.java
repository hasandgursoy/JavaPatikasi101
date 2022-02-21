package Exercises3;

import java.util.Scanner;

public class ExponentialCalc {
    public static void main(String[] args) {

        // Kullanıcıdan alınan bilgilere göre üs hesaplicaz.

        Scanner scn = new Scanner(System.in);
        int number,exponential,holder =1;

        System.out.print("Üssünü almak istediğiniz sayıyı giriniz : ");
        number = scn.nextInt();
        System.out.print("Üssü giriniz :");
        exponential = scn.nextInt();


        for (int i =1; i <= exponential ; i++){
            holder = number * holder;
            System.out.println(holder);
        }

    }
}
