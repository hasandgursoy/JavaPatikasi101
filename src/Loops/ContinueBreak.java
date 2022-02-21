package Loops;

import java.util.ArrayList;

public class ContinueBreak {
    public static void main(String[] args) {

        // Continiue = O sırayı atla
        // Break = döngüyü bitir.

        for (int i = 0;i <= 10; i++){

            if (i == 8){
                break;
            }
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("*********** While ile yapılmış hali ***********");

        // Bu örnekde güzel bir hataya rastladım a++ yı while'ın en altına yazdığımda
        // a = 2 olduğunda continue'dan aşşağı inmesine izin vermedği için a artmadı
        // bu şekilde sonsuz döngüye girdi.

        int a = 1;
        while (a <=10){
            a++;
            if (a%2 ==0){
                continue;
            }
            System.out.println("Tek :"+a);

        }

        // Java da rakam kullanmadan 100'e kadar nasıl yazdırırız.

        ArrayList<Integer> list = new ArrayList<Integer>();
        String tenDots = "..........";

        for (int b = 'X' / 'X'; b <=(tenDots.length()*tenDots.length());b++){
            list.add(b);
        }
        System.out.println(list);


    }
}
