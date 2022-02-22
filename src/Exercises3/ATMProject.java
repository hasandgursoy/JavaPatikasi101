package Exercises3;

import java.util.Scanner;

public class ATMProject {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String userName,password;
        int right = 3;
        int balance = 1500;
        int selecter,howMuch;




        while (right >0){
            System.out.print("Kullanici Adınızı Giriniz :");
            userName = scn.nextLine();
            System.out.print("Kullanici Şifrenizi Giriniz :");
            password = scn.nextLine();
            if (userName.equals("admin") && password.equals("admin")){
                System.out.println("Merhaba, Ziraat Bankasına Hoş Geldiniz!");
                do {
                    System.out.println("Lütfen Yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1- Para Yatırma\n2- Para Çekme\n3- Bakiye sorgula\n4- Çıkış Yap");
                    selecter = scn.nextInt();
                    if (selecter == 1){
                        System.out.print("Ne kadar yatırmak istiyorsunuz :");
                        howMuch = scn.nextInt();
                        balance += howMuch;
                        System.out.println("Yeni Hesap Bakiyeniz :"+balance);
                    }else if(selecter ==2){
                        System.out.print("Ne kadar para çekmek istiyorsnuz :");
                        howMuch = scn.nextInt();

                        if (howMuch <= balance){
                            System.out.print("İşleminiz Gerçekleştiriliyor...");
                            balance -= howMuch;
                            System.out.println("Yeni Hesap Bakiyeniz :"+balance);
                        }else {
                            System.out.print("Hesabınız da yeteri miktarda para bulunmamaktadır.");

                        }

                    }else if(selecter == 3){
                        System.out.println("Mevcut bakiyeniz : "+balance);
                    }else if (selecter == 4){
                        System.out.println("Çıkış Yapılıyor ...");
                        right =0;
                    }
                }while (!(selecter == 4));
            }else {
                right--;
                System.out.println("Giriş Başarısız Tekrar Deneyin");
                System.out.println("Kalan Hak :"+right);
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }
            }
        }



    }

}
