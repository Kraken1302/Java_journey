package Day4;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice: rock, paper, or scissors");

        String userChoice = sc.nextLine().toLowerCase();

        // Generate computer's choice
        int compChoice = random.nextInt(3);
        String computerChoice = "";
        if (compChoice == 0) {
            computerChoice = "rock";
        } else if (compChoice == 1) {
            computerChoice = "paper";
        } else {
            computerChoice = "scissors";
        }

        System.out.println("Computer chose: " + computerChoice);

        // Determine winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
