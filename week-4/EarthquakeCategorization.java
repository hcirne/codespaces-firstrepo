import java.util.Scanner;

public class EarthquakeCategorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        double magnitude = 0;

        while (true) {
            System.out.print("Enter the measured magnitude: ");
            String input = scanner.nextLine().trim();

            input = input.replace(',', '.');

            try {
                magnitude = Double.parseDouble(input);

                if (0 <= magnitude && magnitude <= 10) {
                    break;
                } else {
                    System.out.println("Please insert a valid magnitude in the Richter scale. Must be a number between 0 and 10.");
                }
            } catch (NumberFormatException error) {
                System.out.println("Invalid input. Please introduce a number.");
            }
        }

        scanner.close();

        System.out.println("Registered magnitude: " + magnitude);  // Output user input    
        System.out.print("Category: ");
        
        String category = (magnitude < 2) ? "Micro" :
            (magnitude < 4) ? "Minor" :
            (magnitude < 5) ? "Light" :
            (magnitude < 6) ? "Moderate" :
            (magnitude < 7) ? "Strong" :
            (magnitude < 8) ? "Major" :
            "Great";

        switch(category) {
            case "Micro":
                System.out.println("Micro");
                break;
            case "Minor":
                System.out.println("Minor");
                break;
            case "Light":
                System.out.println("Light");
                break;
            case "Moderate":
                System.out.println("Moderate");
                break;
            case "Strong":
                System.out.println("Strong");
                break;
            default:
                System.out.println("Great");
                System.out.println("Fun fact: The 1755 Lisbon earthquake is historically estimated to have had a magnitude of about 8.5 to 9.0 on the modern Richter scale.");
        }
    }
}
