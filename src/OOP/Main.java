package OOP;

public class Main {

    public static void main(String[] args) {
        // Sınıf'larda değer atanmassa null döner

        Car auidi = new Car();
        auidi.model = "Auidi A7";
        auidi.type  = "Sprots";
        auidi.speed = 10;
        auidi.increaseSpeed(20);
        auidi.decreaseSpeed(10);
        System.out.println(auidi.model + " Hızı :"+auidi.speed);
        System.out.println(auidi.model);
        auidi.printInfo();


        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;
        bmw.increaseSpeed(50);
        bmw.decreaseSpeed(20);
        bmw.showSpeed();
        System.out.println(auidi.model + " Hızı :"+bmw.speed);
        bmw.printInfo();

        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
        mercedes.showSpeed();
        System.out.println(mercedes.model + " Hızı : "+mercedes.speed);
        mercedes.printInfo();

        ConstructorCar sahin = new ConstructorCar("133","slx","mavi");
        System.out.println("Model :"+sahin.model+"\nType :"+sahin.type+"\nRengi :"+sahin.color);
        sahin.printInfo();




    }

}
