package Arrays;

public class OneDimensionalArrays {

    public static void main(String[] args) {

        // Tek boyutlu Arrayleri aslında Array dersinde gördük ama neyse.

        double[] list1 = new double[5];
        String[] days = {"Pazartesi","Salı","Çarşamba"};
        days[0] = "Perşembe";
        System.out.println(days.length);
        System.out.println(days[0]);

        for (int i = 0; i< days.length;i++){
            System.out.println(days[i]);
        }
    }

}
