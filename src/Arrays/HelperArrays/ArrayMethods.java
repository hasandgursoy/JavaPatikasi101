package Arrays.HelperArrays;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        int[] list2 = {5, 12, 132, 5123, 3232};
        int[] list3 = {3, 4, 7, 8, 0, 1, 2, 5, 6, 9, 10};
        HelperArrays helper = new HelperArrays();
        helper.print(list);
        helper.print(list2);

        // Helper Array sınıfındaki herşey normalde Array methodlarında var zaten böyle birşey yapmaya gerek yok yani.
        // Static tanımlanan bir method'a heryerden ulaşabiliriz.

        HelperArrays.print(list2); // Aynısını yaptık obje oluşturmadan.

        System.out.println(" ========= Arrays Methods =========");
        // 1.Arrays.toString(list);
        // Diziye ait elemanları tek tek bastıran methoddur.
        System.out.println(Arrays.toString(list2));

        // 2. Arrays.fiil();
        // Dizimizin belirli bir bölümüne değerler atayabiliriz.
        Arrays.fill(list, 0, 2, 15);
        System.out.println(Arrays.toString(list));

        // 3. Arrays.sort()
        // Dizideki elemanları sıralayabiliyoruz.
        Arrays.sort(list3);
        System.out.println(Arrays.toString(list3));

        // 4.Arrays.binarySearch();
        // Bu methodu kullanabilmek için ilk önce sort etmek lazım
        // Dizide ki bir elemanın indis değerini bulmak için kullanılabilir.

        System.out.println(Arrays.binarySearch(list3, 10));

        // 4.Arrays.copyOf() ve Arrays.copyOfRange()
        // Arrays.copyOf() = mevcut diziyi kopyalar
        // Arrays.copyOfRange() = verilen aralıkda diziyi kopyalar.

        int[] copyList = Arrays.copyOf(list2, list2.length);
        System.out.println(Arrays.toString(copyList));
        int[] anotherCopy = Arrays.copyOfRange(list3,0,3);
        System.out.println(Arrays.toString(anotherCopy));

        // 5. Arrays.equals()

        //Kendi yazdığımız uygulama

        System.out.println(HelperArrays.equals(list,list2));

        // Normal halini kullanalım

        System.out.println(Arrays.equals(list,list2));






    }

}
