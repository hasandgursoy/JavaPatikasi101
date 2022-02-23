package Methods;

public class LocalVariablesToJava {

    static int sum (int n1, int n2){
        int a = 25; // bu değişken aşşağıdaki scope'da da tanımlandı ancak bu code bloğunun scopu farklı olduğu için
        // burda tekrar aynı ad da değişken tanımlayabiliyoruz.
        return 25;
    }

    public static void main(String[] args) {

        int a = 5;

        if (a <10){
            int b = 20;
        }
        // System.out.println(b); Bu kod çalışmayacaktır. Neden mi ? çünkü if bloğunun içinde.
        // Sadece o bloğun içinden çağırılabilir.



    }

}
