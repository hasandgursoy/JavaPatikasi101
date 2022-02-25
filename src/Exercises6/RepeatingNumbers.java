package Exercises6;

public class RepeatingNumbers {

    static boolean isFind(int [] arr,int val){
        for (int i:arr){
            if (i == val){
                return true;
            }
        }
        return  false;

    }

    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate,list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }

        }



    }
}
