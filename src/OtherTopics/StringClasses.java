package OtherTopics;

public class StringClasses {
    public static void main(String[] args) {

        // str.charAt() String'in harflerine bölüp index'de hangi değer varsa onu dönüyor.
        String str = "patika";
        System.out.println(str.charAt(2));

        // str.compareTo() Stringlerin eşit olup olmadığına bakar.
        // Büyük - Küçük harf duyarlıdır.
        // str.compareToIgnoreCase() = Bu büyük - küçük umursamaz karşılaştırır.

        // str.concat() = stringleri birleştirir.
        String newPatika = str.concat(".dev");
        System.out.println(newPatika);

        // str.contains() = parantez içine yazılan ifade String'in içinde varmı bakar.
        System.out.println(newPatika.contains(".de"));

        // str.endsWith();
        // str.startWith();
        // str.indexOf();
        // str.isEmpty();
        // str.replace();
        // str.replaceAll();
        // str.substring();
        // str.lowerCase()-upperCase();






        // Kendi Kendime Tersden Yazdırma Antremanı Yaptım
        String name = "Hasan";
        String[] letter = name.split("");
        String reverseName="";
        for (int i = name.length()-1; i>=0;i--){
            reverseName += letter[i];

        }
        System.out.println(name);
        System.out.println(reverseName);

    }
}
