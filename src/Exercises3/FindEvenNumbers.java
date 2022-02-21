package Exercises3;

import java.util.Scanner;

public class FindEvenNumbers {

    public static void main(String[] args) {
        int a;
        Scanner scn = new Scanner(System.in);

        System.out.print("Sayi Giriniz :");
        a = scn.nextInt();
        for (int i = 0; i <= a;i++){

            if (i % 2 ==0){
                System.out.println(i);
            }

        }

    }

}
