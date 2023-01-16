package LAB;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] options = {"rock", "paper", "scissors"};

        System.out.println("Welcome to rock-paper-scissors! Please enter your choice:");

        while (true) {
            String userChoice = scanner.nextLine();
            if (!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper") && !userChoice.equalsIgnoreCase("scissors")) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors:");
                continue;
            }

            int computerChoice = (int) (Math.random() * 3);
            String computerChoiceString = options[computerChoice];
            System.out.println("You chose " + userChoice + ", and the computer chose " + computerChoiceString + ".");

            if (userChoice.equalsIgnoreCase(computerChoiceString)) {
                System.out.println("It's a tie!");
            } else if (userChoice.equalsIgnoreCase("rock") && computerChoiceString.equalsIgnoreCase("scissors") ||
                    userChoice.equalsIgnoreCase("paper") && computerChoiceString.equalsIgnoreCase("rock") ||
                    userChoice.equalsIgnoreCase("scissors") && computerChoiceString.equalsIgnoreCase("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose.");
            }
        }
    }
}



