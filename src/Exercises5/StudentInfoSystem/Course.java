package Exercises5.StudentInfoSystem;

public class Course {

    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void printTeacherInfo() {
        this.teacher.print();
    }

    void addTeacher(Teacher teacher){
        if (teacher.bracnh.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ve Ders bölümleri Uyuşmuyor.");
        }
    }


}
