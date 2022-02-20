package Exercises1;

import java.util.Scanner;

public class KdvPrice {
    public static void main(String[] args) {

        //Değişkenlerin Tanımlanması
        int inpPrice;
        double kdv,priceWithKdv;

        // Verilerin Alınması
        Scanner scn = new Scanner(System.in);
        System.out.print("Lütfen Tutarı Gir : ");
        inpPrice = scn.nextInt();

        kdv = (inpPrice > 1000) ? inpPrice*0.08 : inpPrice*0.18;

        // Verilerin Sonuca Bağlanması
        priceWithKdv = kdv + inpPrice;
        System.out.println("KDV : "+kdv);
        System.out.println("KDV'li ödenmesi gereken tutar : "+ priceWithKdv);




    }
}
