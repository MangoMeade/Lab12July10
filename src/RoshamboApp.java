import java.util.Scanner;

/**
 * Created by aibar on 7/10/2017.
 */
//Author: Andres
//This is a rock paper scissors game app
public class RoshamboApp {
    public static void main(String[] args) {
        rockPaperScissors();
    }

    private static void rockPaperScissors() {
        Scanner scnr = new Scanner(System.in);
        String userName = "";
        String computerName = "";
        String loop = "y";

        while (loop.equalsIgnoreCase("y")) { //loops while player agrees to continue
            System.out.println("What is your name?");
            userName = scnr.nextLine();
            System.out.println("Hi " + userName);
            System.out.println("What is your opponent's name?");
            computerName = scnr.nextLine();
            HumanPlayer user = new HumanPlayer();
            chooseOpponent(userName, computerName, user);

            System.out.println("Continue? (y/n)");
            loop = scnr.nextLine();
            while (!(loop.equalsIgnoreCase("y") || loop.equalsIgnoreCase("n"))) {
                System.out.println("Type Y or N only!");
                loop = scnr.nextLine();
            }
        }
        if (loop.equalsIgnoreCase("n")) {
            System.out.println("Bye!");
        }
    }

    //choose between two opponents, one randomly chooses its weapon, the other one always picks rock
    private static void chooseOpponent(String userName, String computerName, HumanPlayer user) {
        int randomNum = (int) (Math.random() * 2) + 1;
        if (randomNum == 1) {
            RockPlayer dumbComputer = new RockPlayer();
            dumbComputer.setName(computerName);
            System.out.println("Hi " + dumbComputer.getName());
            System.out.print(userName + ", ");
            whoWon(user.generateRoshambo().toString(), dumbComputer.generateRoshambo().toString(), userName);
        } else if (randomNum == 2) {
            RandomPlayer computer = new RandomPlayer();
            computer.setName(computerName);
            System.out.println("Hi " + computer.getName());
            System.out.print(userName + ", ");
            whoWon(user.generateRoshambo().toString(), computer.generateRoshambo().toString(), userName);
        }
    }

    //tihs method checks who won and prints an appropriate response
    public static void whoWon(String userInput, String computerInput, String userName) {
        System.out.println();
        System.out.println(userName + ",");
        String rock = "";
        String paper = "";
        String scissors = "";
        if (userInput.equalsIgnoreCase("rock")) {
            if (computerInput.equalsIgnoreCase("rock")) {
                System.out.println("It's a tie!");
            }
            if (computerInput.equalsIgnoreCase("paper")) {
                System.out.println("You lose!");
            }
            if (computerInput.equalsIgnoreCase("scissors")) {
                System.out.println("You win!");
            }

        }
        if (userInput.equalsIgnoreCase("scissors")) {
            if (computerInput.equalsIgnoreCase("rock")) {
                System.out.println("You lose!");
            }
            if (computerInput.equalsIgnoreCase("paper")) {
                System.out.println("You won!");
            }
            if (computerInput.equalsIgnoreCase("scissors")) {
                System.out.println("It's a tie!");
            }

        }
        if (userInput.equalsIgnoreCase("paper")) {
            if (computerInput.equalsIgnoreCase("rock")) {
                System.out.println("You win!");
            }
            if (computerInput.equalsIgnoreCase("paper")) {
                System.out.println("It's a tie!");
            }
            if (computerInput.equalsIgnoreCase("scissors")) {
                System.out.println("You lose!");
            }

        }
        else {
            System.out.println("Choose one of the available options");
        }

    }

}
