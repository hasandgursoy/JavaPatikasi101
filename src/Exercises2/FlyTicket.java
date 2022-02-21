package Exercises2;

import java.util.Scanner;

public class FlyTicket {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int distance, age, flightType;
        double perKm = 10,ageDiscount = 0,totalPure =0, total,flightTypeDiscount = 0;

        System.out.print("Yaşınızı Giriniz :");
        age = scn.nextInt();
        System.out.print("Tek Yön ise (1) , Gidiş-Dönüş için (2) :");
        flightType = scn.nextInt();
        System.out.print("Mesafeyi Giriniz :");
        distance = scn.nextInt();

        if (age <= 12){
            ageDiscount = 0.50;
        }else  if (age >12 && age < 24){
            ageDiscount = 0.10;
        }else if (age > 65) {
            ageDiscount = 0.30;
        }

        if (flightType == 2) {
            flightTypeDiscount = 0.20;
        }

        totalPure = distance * perKm;


        if (distance > 0 && age > 0 && age < 100 && flightType>= 1 && flightType <=2){



            if (flightType == 2){
                total = ((totalPure - (totalPure * ageDiscount))  - (totalPure * flightTypeDiscount) ) *2;
                System.out.println("İndirimsiz Tutar :"+totalPure*2);
                System.out.println("İndirimli Tutar :"+total);
            }else {
                total = (totalPure - (totalPure * ageDiscount))  - (totalPure * flightTypeDiscount);
                System.out.println("İndirimsiz Tutar :"+totalPure);
                System.out.println("İndirimli Tutar :"+total);
            }





        }else {
            System.out.println("Hatalı işlem yaptınız.");
        }


    }

}
