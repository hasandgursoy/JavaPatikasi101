package Exercises4;

import java.util.Scanner;

public class RecursivePrime {

    static void isPrime(int num, int i) {
        if (i == num) {
            System.out.print(num + " is a prime number.");
            return;
        } else if (num%i == 0) {
            System.out.print(num + " is not a prime number.");
            return;
        }

        isPrime(num, i + 1);
    }

    public static void main(String[] args) {

        // Recursive kullanarak asal sayı'mı değil mi bulacağız.
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter a num: ");
        num = input.nextInt();

        isPrime(num, 2);

    }

}
