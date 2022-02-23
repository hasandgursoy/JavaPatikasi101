package Exercises4;

import java.util.Scanner;

public class RecursiveExponential {

    static int pow(int exp,int base){

        if (exp == 0){
            return 1;
        }

        return pow(exp-1,base) * (base);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Üs hesaplayan recursive method yazacaz.
        System.out.print("Taban Değerini Giriniz :");
        int n1 = scn.nextInt();
        System.out.print("Üs Değerini Giriniz :");
        int n2 = scn.nextInt();

        System.out.println(pow(n2,n1));



    }

}
