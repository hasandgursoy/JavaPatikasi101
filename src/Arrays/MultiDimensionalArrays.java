package Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] matris = new int[6][6];

        // Burdaki olay ilk kutu satır ikinci kutu sütun.

        int[][] anotherMatris= {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };

        // Çok boyutlu dizilerde matris'in lenght'i satır'ın uzunluğu demektir.

        for (int i=0;i <anotherMatris.length;i++){
            for (int k = 0;k< anotherMatris[0].length;k++){
                System.out.print(anotherMatris[i][k]+", ");
            }
            System.out.println();
        }


        System.out.println(matris[5][5]);

    }
}
