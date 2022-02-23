package Methods;

public class MethodOverloading {

    public static void main(String[] args) {

        // Aynı adı taşıyan ancak aynı görevleri yapmayan yada aynı değerleri istemeyen
        // Methodlar oluşturuyorsak overloading işlemi gerçekleştirmiş oluyoruz.
        // Aşşağıda mesela 3 farklı print() fonskiyonu oluşturduk aynı ismi taşımalarına rağmen farklı işlemler gerçekleştiriyolar.
        // Java'da oldukça kullanılan bir yöntemdir.



        print();
        print(15);
        System.out.println(print(5,10));


    }

    static void print(){
        System.out.println("Paremetresiz");

    }

    static void print(int a){
        System.out.println("Paremetreler : "+a);
    }

    static int print(int a,int b){
        return a + b;
    }

}
