package Exercises5.StudentInfoSystem;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "0564676665", "TRH");
        Teacher t2 = new Teacher("Graham Bell","05523648965","FZK");
        Teacher t3 = new Teacher("Külyutmaz","0547865946","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji","103","BIO");

        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExcamNote(100,80,50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","567","4",tarih,fizik,biyo);
        s2.addBulkExcamNote(45,68,97);
        s2.isPass();



    }


}
