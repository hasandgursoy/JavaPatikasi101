package Conditions;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Haftanın kaçıncı günü : ");
        int day = scn.nextInt();

        switch (day) {
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Salı");
            case 3 -> System.out.println("Çarşamba");
            case 4 -> System.out.println("Perşembe");
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println("Pazar");
        }

    }

}
