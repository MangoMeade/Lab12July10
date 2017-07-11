import java.util.Scanner;

/**
 * Created by aibar on 7/10/2017.
 */
//User chooses which option he/she wants
public class HumanPlayer extends Player {
    Scanner scnr = new Scanner(System.in);

    String input = " ";

    @Override
    public Roshambo generateRoshambo() {

        System.out.println("choose paper, rock or scissors");
        input = scnr.nextLine();
        Roshambo choice = Roshambo.DEFAULT;
        if (input.equalsIgnoreCase("ROCK")) {
            choice = Roshambo.ROCK;
        }
        else if (input.equalsIgnoreCase("PAPER")) {
            choice = Roshambo.PAPER;
        }
        else if (input.equalsIgnoreCase("SCISSORS")) {
            choice = Roshambo.SCISSORS;
        }
        return choice;

    }

//    @Override
//    public String toString() {
//        return choice + "";
//    }
}

