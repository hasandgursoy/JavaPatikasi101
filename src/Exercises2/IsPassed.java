package Exercises2;

import java.util.Scanner;

public class IsPassed {

    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;
        int average;
        boolean isPassed;

        // Verilerin Alınması
        Scanner scn = new Scanner(System.in);

        System.out.print("Lütfen Matematik Notunuzu Giriniz :");
        mat = scn.nextInt();

        System.out.print("Lütfen Fizik Notunuzu Giriniz :");
        fizik = scn.nextInt();

        System.out.print("Lütfen Kimya Notunuzu Giriniz :");
        kimya = scn.nextInt();

        System.out.print("Lütfen Türkçe Notunuzu Giriniz :");
        turkce = scn.nextInt();

        System.out.print("Lütfen Tarih Notunuzu Giriniz : ");
        tarih = scn.nextInt();

        System.out.print("Lütfen Muzik Notunuzu Giriniz :");
        muzik = scn.nextInt();

        average = (mat + fizik + turkce + muzik + kimya +tarih) / 6;
        isPassed = average > 60;

        if (isPassed){
            System.out.println("Tebrikler Sınıfı Geçtiniz : ");

        }else {
            System.out.println("Malesef Sınıfta Kaldınız.");
        }
    }
}
