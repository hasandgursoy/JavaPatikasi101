package Exercises1;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double height,weight,bodyMassIndex;

        System.out.print("Lütfen boyunuzu giriniz : ");
        height = scn.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        weight = scn.nextDouble();

        bodyMassIndex = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz :"+bodyMassIndex);



    }
}
