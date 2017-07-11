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

        userName = Validator.getString(scnr,"What is your name?\n");
        computerName = Validator.getString(scnr, "What is your opponent's name?\n");
        while (loop.equalsIgnoreCase("y")) { //loops while player agrees to continue
            System.out.println("Hi " + userName);
            HumanPlayer user = new HumanPlayer();
            chooseOpponent(userName, computerName, user);
            loop = Validator.getString(scnr,"Continue? (y/n)\n");
            while (!(loop.equalsIgnoreCase("y") || loop.equalsIgnoreCase("n"))) {
                loop = Validator.getString(scnr,"Type Y or N only!\n");
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
            whoWon(user.generateRoshambo().toString(), dumbComputer.generateRoshambo().toString(), userName, dumbComputer.getName());

        } else if (randomNum == 2) {
            RandomPlayer computer = new RandomPlayer();
            computer.setName(computerName);
            System.out.println("Hi " + computer.getName());
            System.out.print(userName + ", ");
            whoWon(user.generateRoshambo().toString(), computer.generateRoshambo().toString(), userName, computer.getName());


        }
    }

    //tihs method checks who won and prints an appropriate response
    public static String whoWon(String userInput, String computerInput, String userName, String computerName) {
        System.out.println();
        System.out.println(userName + ",");
        String rock = "";
        String paper = "";
        String scissors = "";
        int userScore = 0;
        int computerScore = 0;
        if (userInput.equalsIgnoreCase("rock")) {
            if (computerInput.equalsIgnoreCase("rock")) {
                System.out.println("It's a tie!");

            }
            if (computerInput.equalsIgnoreCase("paper")) {
                System.out.println("You lose!");
                computerScore += 1;
            }
            if (computerInput.equalsIgnoreCase("scissors")) {
                System.out.println("You win!");
                userScore += 1;
            }

        }
        if (userInput.equalsIgnoreCase("scissors")) {
            if (computerInput.equalsIgnoreCase("rock")) {
                System.out.println("You lose!");
                computerScore += 1;
            }
            if (computerInput.equalsIgnoreCase("paper")) {
                System.out.println("You won!");
                userScore += 1;
            }
            if (computerInput.equalsIgnoreCase("scissors")) {
                System.out.println("It's a tie!");
            }

        }
        if (userInput.equalsIgnoreCase("paper")) {
            if (computerInput.equalsIgnoreCase("rock")) {
                System.out.println("You win!");
                userScore += 1;
            }
            if (computerInput.equalsIgnoreCase("paper")) {
                System.out.println("It's a tie!");
            }
            if (computerInput.equalsIgnoreCase("scissors")) {
                System.out.println("You lose!");
                computerScore += 1;
            }
        }
        else if(!(userInput.equalsIgnoreCase("rock") || userInput.equalsIgnoreCase("paper") || userInput.equalsIgnoreCase("scissors"))){
            System.out.println("Choose one of the available options");
        }
        return userScore + " " + computerScore;
    }

}
