package Exercises2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year;
        System.out.print("Yıl Giriniz :");
        year = scn.nextInt();

        if ((year % 4 == 0)&& !(year %100 == 0)) {
            System.out.println("Sayi Artıktır");
        }else if (year % 400 == 0){
            System.out.println("Sayi Artıktır");
        }else {
            System.out.println("Sayi Artık Değildir");
        }

    }
}
