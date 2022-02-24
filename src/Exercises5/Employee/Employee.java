package Exercises5.Employee;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        if (this.salary >= 0) {
            this.salary = salary;
        }
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {

        int tax;

        if (this.salary < 1000) {
            tax = 0;
        } else {
            tax = (this.salary / 100) * 3;
        }
        return tax;
    }

    double bonus(){
        double bonus;
        if (this.workHours > 40){
            bonus = ((this.workHours) - 40) * 30;

        }else {
            bonus =0;
        }
        return bonus;
    }

    double raiseSalary(){
        double newTime = this.hireYear > 2021 ? (this.hireYear - 2021) : this.hireYear;
        double icrement=0;
        if (newTime < 10){
            icrement = ((this.salary/100.0) * 5);

        }else if(newTime > 9 && newTime <=20){
            icrement = ((this.salary /100.0)*10 );

        }else if(newTime > 19){
            icrement = ((this.salary/100.0)*15);

        }

        return icrement;

    }

    void tooString(){
        System.out.println("Adı :"+this.name);
        System.out.println("Salary :"+this.salary);
        System.out.println("Çalışma Saati :"+this.workHours);
        System.out.println("Başlangıç Yılı :"+this.hireYear);
        System.out.println("Tax : "+ this.tax());
        System.out.println("Bonus :"+this.bonus());
        System.out.println("Maaş Artışı :"+this.raiseSalary());
        System.out.println("Vergi Ve Bonuslar İle Birlikte Maaş :"+(salary+tax()+bonus()));
        System.out.println("Toplam Maaş :"+(this.salary+this.raiseSalary()+tax()+bonus()));
    }

}
