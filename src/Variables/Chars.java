package Variables;

public class Chars {
    public static void main(String[] args) {

        char vChar = 'b';
        char v2Char = 98; // ASCI code

        System.out.println(vChar);
        System.out.println(v2Char);
        char c1 = 'J';
        char c2 = 'A';
        char c3 = 'V';
        char c4 = 'A';

        String programingLanguageName = String.valueOf(c1+c2+c3+c4);
        System.out.println(programingLanguageName);

        // Yukarıdaki String.valueOf() ifadesi ASCI codelar genelde int değerlerdir. Bu şekilde onun String oluşturmak için kullanabiliyoruz.




//        String ifadeyi harflere bölme;
//        String name = "Hasan";
//        String[] harfler = name.split("");
//
//        for (int i = 0; i < name.length();i++){
//            System.out.println(harfler[i]);
//        }

    }
}
