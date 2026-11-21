import java.util.Scanner;

public class Main {
    // Declaring variables
    public static int userInput = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Start the continuous loop
        while (true) {
            System.out.println("\nWelcome to Marlon's Inventory System!");
            System.out.println("What would you like to do?");
            System.out.println("Possible options: ");
            System.out.println("1. View Inventory");
            System.out.println("2. Remove an Item");
            System.out.println("3. Edit an Item");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.print("Enter the corresponding number of the option you want to do: ");

            // Read the number entered by the user
            userInput = scanner.nextInt();
            scanner.nextLine(); // Clears the leftover 'Enter' key press

            // Decide output based on user input
            if (userInput == 1) {
                System.out.println("You have chosen to view the inventory. Continue? ['Y/N']");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    System.out.println("Displaying inventory...");
                    // Put your view inventory code here
                }
            } else if (userInput == 2) {
                System.out.println("You have chosen to remove an item. Continue? ['Y/N']");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    System.out.println("Removing item...");
                    // Put your remove item code here
                }
            } else if (userInput == 3) {
                System.out.println("You have chosen to edit an item. Continue? ['Y/N']");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    System.out.println("Editing item...");
                    // Put your edit item code here
                }
            } else if (userInput == 4) {
                System.out.println("Exiting Marlon's Inventory System. Goodbye!");
                break; // Breaks out of the while loop and ends the program
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        scanner.close();
    }
}
