package Exercises3;

import java.util.Scanner;

public class EBOBEKOK {

    public static void main(String[] args) {

        // Java ie ebob ve ekok değerlerini bulan program yapalım

        Scanner scn = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz :");
        int n1 = scn.nextInt();
        System.out.print("n2 sayısını giriniz :");
        int n2 = scn.nextInt();
        int ebob=1;
        // Bu döngünün maliyeti = 18 birim (18 kere dönüyor)
        for (int i = 1; i<= n1; i++){
            if (n1%i==0 && n2%i == 0){
                ebob = i;
            }
        }

        System.out.println(ebob);


        System.out.println("======================");
        // Bu döngünün maliyeti ise yalnızca 12 o yüzden ebob için bu izlenen yol daha mantıklı
        for (int k = n1; k >=1 ; k--){
            if (n1%k==0 && n2%k ==0){
                ebob = k;
                System.out.println(ebob);
                break;
            }
        }

        // Ekok

        for(int i = 1; i <= (n1* n2);i++){

            if (i%n1 == 0 && i%n2 ==0 ){
                System.out.println(i);
                break;
            }

        }

    }
}
