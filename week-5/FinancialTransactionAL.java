import java.util.ArrayList;
import java.util.Scanner;


public class FinancialTransactionAL {
    public static void main(String[] args) {
        ArrayList<String> record = new ArrayList<String>();

        Scanner input = new Scanner(System.in);

        String statement = "";

        while(true) {

            System.out.println("\nMenu.");
            System.out.println("1. Insert new transaction.");
            System.out.println("2. Check past transactions.");
            System.out.println("3. Calculate expenses.");
            System.out.println("4. Exit.");
            System.out.print("\nPlease insert the number corresponding to a task: ");

            int choice = Integer.parseInt(input.nextLine());

            switch(choice) {
                case 1:
                    while (true) {
                        System.out.print("Transaction type: ");
                        String type = input.nextLine();

                        System.out.print("Transaction amount: ");
                        String amount = input.nextLine();

                        System.out.print("Transaction date: ");
                        String date = input.nextLine();

                        statement = type + "," + amount + "," + date;
                        record.add(statement);
                        
                        System.out.println("Recently added statement: " + record.get(0));

                        System.out.print("Would you like to add a new statement? Please answer with 'yes' or 'no': ");
                        String decision = input.nextLine();

                        if (decision.equals("no")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    if (record.size() == 0) {
                        System.out.println("No statements registered.");
                    } else {
                    System.out.println("\nFind below all the registered statements.");
                        for (String r : record) {
                            System.out.println(r);
                        }
                    }
                    break;
                case 3:
                    System.out.println("To implement.");
                case 4:
                    System.out.println("Exiting program.");
                    input.close();
                    return;
                default:
                    System.out.println("Please insert a valid option.");

            }
        }
    }    
}
