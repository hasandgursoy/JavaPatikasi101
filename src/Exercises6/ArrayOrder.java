package Exercises6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrder {

    // Array'i sıralicaz Array'in uzunluğunu ve değerlerini kullanıcıdan alacaz.

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Dizi Boyutu :");
        int arr = scn.nextInt();
        int num = 1;
        int val;
        int[] list = new int[arr];
        while (arr >0){

            System.out.print(num+" Eleman :");
            val = scn.nextInt();
            list[num-1] = val;
            num++;
            arr--;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));






    }

}
