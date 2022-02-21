package Exercises2;

import java.util.Scanner;

public class GiveAdvice {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int heat;

        System.out.println("Sıcaklık Kaç Derece ? : ");
        heat = scn.nextInt();

        if (heat < 5){
            System.out.println("Kayak Yap");
        }else if (5 < heat && heat < 15){
            System.out.println("Sinemaya Git");
        }else if (15 < heat && heat < 25){
            System.out.println("Piknik Yap");
        }else {
            System.out.println("Yüzmeye Git");
        }


    }
}
