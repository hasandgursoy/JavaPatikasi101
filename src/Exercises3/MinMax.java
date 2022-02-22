package Exercises3;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Kaç tane Sayı Girmek istiyorsunuz :");
        int n = scn.nextInt();
        int num;
        int min = 0,max = 0;
        for (int i = 1; i <= n; i++){
            System.out.print(i+". Sayıyı Giriniz :");
            num = scn.nextInt();

            if (i == 1){
                min = num;
                max = num;
            }else{
                if (num < min){
                    min = num;
                }else {
                    max = num;
                }
            }

        }

        System.out.println("Max :"+ max );
        System.out.print("Min :"+min);



    }
}
