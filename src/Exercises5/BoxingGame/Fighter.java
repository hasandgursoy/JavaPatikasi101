package Exercises5.BoxingGame;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (this.dodge >= 0 && this.dodge <= 100){
            this.dodge = dodge;
        }else {
            this.dodge = 0;
        }

    }

    int hit(Fighter foe){

        if (foe.isDodge()){
            System.out.println(foe.name+" gelen hasarı blokladı!");
            return foe.health;
        }

        if (foe.health - this.damage < 0){
            return 0;
        }

        System.out.println(this.name+" => "+foe.name+ " "+this.damage+ " hasar vurdu.");

        return foe.health - this.damage;
    }

    boolean isDodge(){
        double random = Math.random() * 100;
        return  random  <= this.dodge;
    }


}




