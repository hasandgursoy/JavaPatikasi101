package Exercises1;

import java.util.Scanner;

public class ManavPrograming {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        double armutS,elmaS,domatesS,muzS,patlicanS,result;


        System.out.print("Armut Kaç kilo : " );
        armutS = scn.nextInt();
        System.out.print("Elma Kaç kilo : " );
        elmaS = scn.nextInt();
        System.out.print("Domates Kaç kilo : " );
        domatesS = scn.nextInt();
        System.out.print("Muz Kaç kilo : " );
        muzS = scn.nextInt();
        System.out.print("Patlican Kaç kilo : " );
        patlicanS = scn.nextInt();


        result = (armut*armutS) + (elma * elmaS) + (domates * domatesS) + (muz * muzS) + (patlican *  patlicanS);
        System.out.println("Sonuç : "+result);







    }
}
