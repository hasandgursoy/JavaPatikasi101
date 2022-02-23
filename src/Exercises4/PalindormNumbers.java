package Exercises4;

public class PalindormNumbers {

    // Palindorm sayı = 242 sayısı terseden okunduğunda da 242 dir buna palindorm denir.
    // Bunu yapabilmek için sayının tersden yazılmış haline ulaşmamız lazım.

    static boolean isPalindorm(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            // 1. İlk önce son rakamı bulalım
            lastNumber = temp % 10;
            // 2. Son rakamı 10 ile çarparak yeni son rakamı toplamaya devam edelim.
            reverseNumber = (reverseNumber * 10) + lastNumber;


            temp /= 10;

        }
        // 3. Girilen sayının tersininde aynı olup olmadığını kontrol edelim.
        if (number == reverseNumber) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalindorm(8668));

    }
}
