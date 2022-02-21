package Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        // DoWhile da kod bloğu bir kere çalışıyor sonra sorgulamaya başlıyor.
        int year = 2021;

        do{
            System.out.println(year);
            year++;
        }while (year < 2023);


        Scanner scn = new Scanner(System.in);
        int pass;
        boolean askPass = true;

        do {
            System.out.print("Lütfen Şifreyi Giriniz :");
            pass = scn.nextInt();
            if (pass == 123){
                System.out.println("Giriş Başarılı");
                askPass = false;
            }else {
                System.out.println("Tekrar Deneyin");
            }

        }while (askPass);



    }
}
