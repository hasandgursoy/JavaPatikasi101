package Exercises1;

import java.util.Scanner;

public class NoteAverage {
    public static void main(String[] args) {
        
        // Değişkenleri Oluştur
        
        int mat,fizik,kimya,turkce,tarih,muzik;
        int average;
        String isPassed;

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
        System.out.println("Ortalamanız :" + average);

        // Verilerin Sonuca Bağlanması

        isPassed = (average > 60) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(isPassed);

        
    }
}
