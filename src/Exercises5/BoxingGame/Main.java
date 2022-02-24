package Exercises5.BoxingGame;

public class Main {

    public static void main(String[] args) {

        Fighter muhammedAli = new Fighter("Muhammed Ali",10,120,95,95);
        Fighter mikeTyson = new Fighter("Mike Tyson",15,90,90,95);

        Match match = new Match(muhammedAli,mikeTyson,90,95);
        match.run();

    }

}
