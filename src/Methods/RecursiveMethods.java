package Methods;

public class RecursiveMethods {

    static int r(int x){
        int result = 0;
        for (int i = 1; i<= x;i++){
            result +=1;
        }
        return result;
    }

    static int f(int n){
        System.out.println(n);
        if (n == 1){
            return 1;
        }
        return f(n-1) +n;
    }

    public static void main(String[] args) {

        // Recursive Method = Özyineli Method
        // Bir methodun kendi kendini çağırma tekniğidir.
        // Koşul sağlanmassa sonsuza kadar gider.
        // f(1) = 1
        // f(2) = 1 + 2
        // f(3) = 1 + 2 + 3
        // f(4) = 1 + 2 + 3 + 4
        // f(n) = f(n-1) + n;

        System.out.println(f(10));



    }

}
