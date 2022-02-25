package Exercises6;

public class ArraysAvarage {

    public static void main(String[] args) {

        int[] list = {1,3,15,25,30,40};
        int sum=0,avarage;

        for (int i : list){
            sum+=i;
        }
        avarage = sum / list.length;
        System.out.println("Dizinin Ortalaması :"+avarage);


    }
}
