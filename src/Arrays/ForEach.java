package Arrays;

public class ForEach {

    public static void main(String[] args) {

        int[] list = {1,2,3,4};
        String[] cars ={"BMW","Mercedes","Audi"};

        int sum=0;
        for(double i:list){
            sum+=i;
            System.out.println(sum);
        }

        for (String car : cars) {
            System.out.println(car);
        }

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        sum =0;
        for (int[] row : matris) {
            for (int i : row) {
                sum = sum + i;
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        System.out.println(sum);
        

    }

}
