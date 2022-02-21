package Loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        // While döngüsü döngünün ne zaman biteceğini kestiremediğimiz zamanlarda kullanıyoruz genelde.

        int i = 1;
        int k ;
        while (i <10){
            System.out.println(i);
            i++;
            k = 1;
            while (k < 10){
                System.out.print(k);
                k++;
            }


        }

        int left = 100, right = 200;

        while (++left < right--);
        System.out.println();
        System.out.println(left);

        // Mantıksal Sonsuz yada Sonlu Döngü

        Scanner scn = new Scanner(System.in);
        int password;
        boolean isPassTrue = false;

        while (!isPassTrue){
            System.out.print("Şifre Giriniz :");
            password = scn.nextInt();
            if (password == 123){
                System.out.print("Şifre Doğru");
                isPassTrue = true;
            }else {
                System.out.println("Tekrar Deneyin !");
            }

        }


    }
}
