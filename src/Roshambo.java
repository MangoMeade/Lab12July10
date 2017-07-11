/**
 * Created by aibar on 7/10/2017.
 */
//Author: Andres
//This is an enumerator class, you can choose your weapon
public enum Roshambo {DEFAULT, ROCK, PAPER, SCISSORS;

    @Override
    public String toString() {
        String choosenWeapon = " ";
        switch (this) {
            case ROCK:
                choosenWeapon = "rock";
                break;
            case PAPER:
                choosenWeapon = "paper";
                break;
            case SCISSORS:
                choosenWeapon = "scissors";
                break;
            case DEFAULT:
                choosenWeapon = "Choose one of the available options";
        }
        return choosenWeapon;
    }
}
