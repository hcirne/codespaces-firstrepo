public class RockPaperScissors {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.Random rand = new java.util.Random();
        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Type r (rock), p (paper), s (scissors), or q to quit.");

        while (true) {
            System.out.print("Your choice: ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.isEmpty()) {
                continue;
            }
            if (input.equals("q") || input.equals("quit") || input.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            int player = parseChoice(input);
            if (player == -1) {
                System.out.println("Invalid choice. Please enter r, p, s, or q.");
                continue;
            }

            int computer = rand.nextInt(3);
            System.out.println("You chose: " + options[player]);
            System.out.println("Computer chose: " + options[computer]);

            if (player == computer) {
                System.out.println("It's a tie!");
            } else if ((player == 0 && computer == 2) ||
                       (player == 1 && computer == 0) ||
                       (player == 2 && computer == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.println(); // blank line for readability
        }

        scanner.close();
    }

    private static int parseChoice(String input) {
        switch (input) {
            case "r":
            case "rock":
            case "0":
            case "1":
                return 0; // Rock
            case "p":
            case "paper":
            case "2":
            case "3":
                return 1; // Paper
            case "s":
            case "scissors":
            case "scissor":
            case "4":
            case "5":
                return 2; // Scissors
            default:
                return -1;
        }
    }
}