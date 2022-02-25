package Arrays;

public class Arrays {

    static int[] reverse(int[] list){
        int[] reverse = new int[list.length];
        for (int i = list.length-1,j=0; i>=0  ;i--,j++){
            reverse[j] = list[i];
        }
        return reverse;
    }

    static void printArray(int[] arr){
        for (int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] list = new int[10];

        int a1 = 10;
        int a2 = 20;
        int a3 = 30;

        System.out.println(list.length);

        for (int i = 0; i < list.length;i++){
            list[i] = (i * 10) + 10;
            System.out.println(list[i]);
        }

        // Başka bir Array tanımlama yöntemi
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0;i < array.length;i++){
            System.out.print(array[i]);
        }

        printArray(array);

        int[] reverseArray =  reverse(array);
        printArray(reverseArray);


    }




}
