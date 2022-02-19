package Variables;

public class Variables {
    public static void main(String[] args) {

        final int numberOne = 1;
        int numberTwo = 2, numberThree = 3;
        System.out.println(numberOne);
        System.out.println(numberTwo + numberThree + " kere selam");

        int kisaKenar = 5;
        int uzunKenar = 10;

        int alan = kisaKenar * uzunKenar;
        int cevre = 2 * (kisaKenar + uzunKenar);
        System.out.println("Alan : "+alan + " Çevre : "+cevre);

    }
}
