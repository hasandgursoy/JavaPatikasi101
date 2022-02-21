package Exercises2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a,b,sonuc;
        String expression;

        System.out.print("1. Sayıyı Giriniz : ");
        a = scn.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        b = scn.nextInt();

        scn.nextLine();

        System.out.print("Hangi işlemi yapmak istiyoranız işaretini yazınız ('*','/','+','-') :");
        expression = scn.nextLine();
        if (expression.equals("/")){
            sonuc = a / b;
            System.out.println(sonuc);
        }else if (expression.equals("*")){
            sonuc = a * b;
            System.out.println(sonuc);
        }else if (expression.equals("+")){
            sonuc = a + b;
            System.out.println(sonuc);
        }else {
            sonuc = a - b;
            System.out.println(sonuc);
        }





    }

}
