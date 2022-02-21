package Exercises2;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String userName, password;

        System.out.print("Kullanıcı Adı : ");
        userName = scn.nextLine();
        System.out.print("Kullanıcı Şifresi : ");
        password = scn.nextLine();

        if (userName.equals("hasan") && password.equals("123456")) {

            System.out.println("Giriş Başarılı");
        }else  {
            System.out.println("Giriş Başarısız");
        }

    }

}
