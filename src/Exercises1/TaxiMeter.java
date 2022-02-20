package Exercises1;

import java.util.Scanner;

public class TaxiMeter {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double perKm = 2.20;
        int openingPrice = 10;
        double distance,result;

        System.out.println("Kaç km gideceksiniz : ");
        distance = scn.nextDouble();

        result = (distance*perKm + openingPrice) < 20 ? 20 : (distance * perKm) + openingPrice;
        System.out.println("Ödemeniz gereken tutar : "+result);



    }
}
