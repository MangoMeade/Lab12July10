/**
 * Created by aibar on 7/10/2017.
 */
//Randomly chooses one of the elements of the Roshambo enumerator
public class RandomPlayer extends Player{


    public Roshambo generateRoshambo() {
        Roshambo choice = Roshambo.DEFAULT;

        int randomNum = (int)(Math.random() * 3) + 1;
        if (randomNum == 1) {
            choice = Roshambo.ROCK;
        }
        else if (randomNum == 2) {
            choice = Roshambo.PAPER;
        }
       else if (randomNum == 3) {
            choice = Roshambo.SCISSORS;
        }
        System.out.println("I choose " + choice);
        return choice;
    }

//    @Override
//    public String toString() {
//        return choice;
//    }
}
