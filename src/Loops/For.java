package Loops;

public class For {
    public static void main(String[] args) {

        // Ne zaman biteceğini bildiğimiz döngülerde kullanıyoruz.

        int sum =0;
        for (int sayac = 0; sayac < 10;sayac+=2){
            sum = sum + sayac;
            System.out.println(sum);
        }

    }
}
