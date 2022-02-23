package Methods;

public class Methods {
    public static void main(String[] args) {

        // Tekrar'a düşmemek için kullandığımız yapılardır.
        // Eğer birşeyi defalarca kullanmamız gerekiyorsa ve bunu method'a çevirmiyorsak ameleyizdir.

        // Method geriye değer döndürmüyorsa (void)
        // Geriye değer döndürüyorsa (type tanımlıcaz ve return;)

        int number = power(5,3);
        System.out.println(number);

        isPrime(137);

    }

    // Üslü sayı bulan metot.
    // Static bir method içerisine method çağırmak istiyorsak yazdığımız method da satatic olmalı.
    static int power(int base,int exp){
        int a = 1;
        for (int i = 1;i <= exp;i++){

            a *=base;
        }

        return  a;

    }


    static void isPrime(int number){

        boolean isPrime = false;

        for (int i = 2; i < number; i++){

            if ((number % i ==0)){
                isPrime = true;
                break;
                // Break koymazsak son değer asal olmadığı için her zaman sonuç asal'dır çıkıyor :D
            }else {
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("Sayı Asal Değildir.");
        }else {
            System.out.println("Sayi Asaldır.");
        }

    }
}
