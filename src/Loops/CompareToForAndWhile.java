package Loops;

import java.util.Scanner;

public class CompareToForAndWhile {
    public static void main(String[] args) {

        // Sonunu bilmediğimiz halde for kullandık ancak bu pek sağlıklı gözükmedi.
        // Çünkü yaptığında satır sayısı daha fazla bu yüzden for'un kullanım amacı buna uygun değil.
        // For ile yapılmış hali
        Scanner scn = new Scanner(System.in);
        int sayi;
        for (boolean run = true;run;){
            System.out.print("Sayi Giriniz :");
            sayi = scn.nextInt();
            if (sayi < 0){
                run = false;
            }
        }

        // While ile yapılmış hali
        int deger = 1;
        while (deger > 0){
            System.out.print("Sayi Giriniz :");
            deger = scn.nextInt();
        }

    }
}
