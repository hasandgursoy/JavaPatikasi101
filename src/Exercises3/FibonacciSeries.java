package Exercises3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int len;

        System.out.print("The length of Fibonacci Series: ");
        len = input.nextInt();

        int num1 = 0, num2 = 1, temp;
        System.out.print(num1 + " " + num2 + " ");

        for (int i=0; i<len-2; i++) {
            temp = num2;
            num2 += num1;
            num1 = temp;
            System.out.print(num2 + " ");
        }
    }
}
