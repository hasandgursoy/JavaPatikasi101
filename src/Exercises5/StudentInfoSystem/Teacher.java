package Exercises5.StudentInfoSystem;

public class Teacher {

    String name;
    String mpno;
    String bracnh;

    public Teacher(String name, String mpno, String bracnh) {
        this.name = name;
        this.mpno = mpno;
        this.bracnh = bracnh;
    }

    void print(){
        System.out.println("Adı :"+this.name);
        System.out.println("Telefonu :"+this.mpno);
        System.out.println("Bölümü :"+this.bracnh);
    }





}
