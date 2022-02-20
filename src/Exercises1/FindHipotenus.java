package Exercises1;

import java.util.Scanner;

public class FindHipotenus {
    public static void main(String[] args) {

        int a,b,result;
        Scanner scn = new Scanner(System.in);

        System.out.print("a :");
        a = scn.nextInt();
        System.out.print("b :");
        b = scn.nextInt();

        result = (a*a) + (b*b);

        System.out.println("Sonuç : "+result);

    }
}
