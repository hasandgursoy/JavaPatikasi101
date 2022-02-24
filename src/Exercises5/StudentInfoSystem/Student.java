package Exercises5.StudentInfoSystem;

public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    public Student(String name,String stuNo,String classes,Course c1, Course c2, Course c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage =0.0;
        this.isPass = false;

    }

    void addBulkExcamNote(int note1,int note2,int note3){
        if (note1 >= 0 && note1 <=100){
            c1.note = note1;
        }
        if (note2 >= 0 && note2<=100){
            c2.note = note2;

        }
        if (note3 >= 0 && note3 <=100){
            c3.note = note3;

        }
    }

    void printNote(){
        System.out.println(this.c1.name +" Notu :"+this.c1.note);
        System.out.println(this.c2.name +" Notu :"+this.c2.note);
        System.out.println(this.c3.name +" Notu :"+this.c3.note);
        System.out.println("Ortalamanız : "+this.avarage);
    }

    void isPass(){
        this.avarage = (c1.note + c2.note + c3.note) / 3.0;
        if (this.avarage > 55){
            this.isPass = true;
            System.out.println("Hababam Sınıfı Uyanıyor.");
        }else {
            System.out.println("Hababam sınıfı, sınıfta kaldı !");
            this.isPass = false;
        }

        printNote();
    }







}
