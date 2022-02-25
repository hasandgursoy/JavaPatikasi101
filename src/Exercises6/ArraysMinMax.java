package Exercises6;

public class ArraysMinMax {
    public static void main(String[] args) {

        int[] list = {1,23,4,5,61,612};

        int min =list[0],max=list[0];
        for (int i : list ){

            if (i < min){
                min =i;
            }
            if (i> max){
                max = i;
            }

        }
        System.out.println("Max :"+max);
        System.out.println("Min :"+min);

    }
}
