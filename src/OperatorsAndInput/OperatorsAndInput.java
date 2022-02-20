package OperatorsAndInput;

import java.util.Scanner;

public class OperatorsAndInput {
    public static void main(String[] args) {

        System.out.println(" --------- OPERATORS ---------");
        // Math Operators
        // ++ , -- , /, * , %

        // Comparison Operators
        // == ,  !=, < , > , <= , >=

        // Logical Operators
        // && , || , !a , !b

        // Condition Operators
        // b = ( a == 1) ? 1 : 0
        System.out.println(" --------- OPERATORS END ---------");

        System.out.println(" --------- INPUT SCANNER ---------");
        Scanner scn = new Scanner(System.in);

        System.out.print(" A Sayisini Giriniz : ");
        int a = scn.nextInt();
        System.out.println(a);

        System.out.print(" A Sayisini Giriniz : ");
        double b = scn.nextDouble();
        System.out.println(b);

        scn.nextLine();
        System.out.print("Lütfen Adınızı Giriniz : ");

        String str = scn.nextLine();

        if (str.equals("hasan")){
            System.out.println("Hoş geldin hasan nasılsın ? ");
            String selamla = scn.nextLine();

            if (selamla.equals("iyiyim")){
                System.out.println("İyi olmana çok sevindim");
            }else{
                System.out.println("Lütfen üzülme bütün kötü günler geçicidir.");
            }
        }

        System.out.println(str);









        System.out.println(" --------- INPUT SCANNER END---------");





    }
}
