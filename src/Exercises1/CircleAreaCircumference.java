package Exercises1;

import java.util.Scanner;

public class CircleAreaCircumference {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r ;
        double pi = 3.14;
        double circumference,area;

        System.out.print("Daire Yarı Çapını Giriniz : ");
        r = scn.nextInt();

        area = pi * r *r;
        circumference = 2 * pi * r;

        System.out.println("Circumference : "+circumference);
        System.out.println("Area : "+area);

        System.out.println(Math.pow(10,70));



    }

}
