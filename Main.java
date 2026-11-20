import java.util.Scanner;

public class Main {
    //declaring variables
    int userInput = 0;
    Scanner scanner = new Scanner(System.in);
    
    //ask user for a input
    public static void main(String[] args) {
        System.out.println("Welcome to Marlon's Inventory System!");
        System.out.println("What would you like to do?");
        System.out.println("Possible options: ");
        System.out.println("1. View Inventory");
        System.out.println("2. Remove Item");
        System.out.println("3. Edit an Item");
        System.out.println("");
        System.out.println("Enter the corresponding number of the option you want to do");
        }
    
    {
        //get user input and store it in a variable
        userInput = scanner.nextInt();
        }
    {        
        //decide output based on user input
    if (userInput == 1) {
        System.out.println("You have chosen to view the inventory. Continue?['Y/N']");
    } else if (userInput == 2) {
        System.out.println("You have chosen to remove an item. Continue?['Y/N']");
    } else if (userInput == 3) {
        System.out.println("You have chosen to edit an item. Continue?['Y/N']");
    } else {
        System.out.println("Invalid input. Please try again.");
    }
   
    }
}
