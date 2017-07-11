/**
 * Created by aibar on 7/10/2017.
 */
//Always picks rock from the Roshambo enumerator
public class RockPlayer extends Player{

    @Override
    public Roshambo generateRoshambo() {
        Roshambo choice = Roshambo.ROCK;
        System.out.println("I am " + getName() + " I choose " + choice + "!");
        return choice;
    }

    @Override
    public String toString() {
        return choice.toString();
    }
}
