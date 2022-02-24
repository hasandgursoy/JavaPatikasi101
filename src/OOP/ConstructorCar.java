package OOP;

public class ConstructorCar {
    // Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    ConstructorCar(String model, String type, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        System.out.println("Nesne Oluşturuldu");
    }


    void increaseSpeed(int increment) {
        if (this.speed + increment < this.speedLimit) {
            this.speed += increment;

        }

    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }

    }

    void showSpeed() {
        System.out.println("Hızınız : " + speed);
    }

    void printInfo() {
        System.out.println("Model : \t" + this.model);
        System.out.println("Color : \t" + this.color);
        System.out.println("Type  : \t" + this.type);
    }
}
