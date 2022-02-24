package OOP;

public class Car {

    // Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    void increaseSpeed(int increment){
        if (speed + increment< speedLimit ){
            this.speed += increment;

        }

    }

    void decreaseSpeed(int decrease){
        if (speed > 0){
            this.speed -= decrease;
        }

    }

    void showSpeed(){
        System.out.println("Hızınız : "+speed);
    }

}
