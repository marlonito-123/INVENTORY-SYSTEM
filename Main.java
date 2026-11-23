import java.util.Scanner;

public class Main {
    // Declare variables
    public static int userInput = 0;
    public static String newName = "";
    public static int newPrice = 0;
    public static int newQuant = 0;
    public static String newDescription = "";
    public static String loop = "true";
    public static String itemOnestat = "Available";
    public static String itemOne = "Apples";
    public static int itemOneprice = 15;
    public static int itemOnequant = 5;
    public static String itemOnedescription = "Food & Nutritiom";
    public static String itemTwostat = "Available";
    public static String itemTwo = "Bananas";
    public static int itemTwoprice = 10;
    public static int itemTwoquant = 10;
    public static String itemTwodescription = "Food & Nutrition";
    public static String confirmedEdit;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Start the continuous loop
        while (loop.equals("true")) {
            System.out.println("\nWelcome to Marlon's Inventory System!");
            System.out.println("What would you like to do?");
            System.out.println("Possible options: ");
            System.out.println("1. View Inventory");
            System.out.println("2. Remove an Item");
            System.out.println("3. Edit an Item");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.println("Enter the corresponding number of the option you want to do: ");

            // Read the number entered by the user
            userInput = scanner.nextInt();
            scanner.nextLine(); // Clears the leftover 'Enter' key press

            // Decide output based on user input
            if (userInput == 1){ 
                System.out.println("You have chosen to view the inventory. Continue? ['Y/N']");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    loop = "false";
                    //Displays all items, all items are "Available"
                    if (itemOnestat == "Available" & itemTwostat ==  "Available"){
                    System.out.println("Displaying inventory...");
                    System.out.println("1."+itemOne+" --- $"+itemOneprice);
                    System.out.println("Quantity: "+itemOnequant);
                    System.out.println("Item Deescription: "+ itemOnedescription);
                    System.out.println("2."+itemTwo+" --- $"+itemTwoprice);
                    System.out.println("Quantity: "+itemTwoquant);}
                    System.out.println("Item Description: "+itemTwodescription);
                    {
                    //Displays only Item 2, if Item 1 got removed
                    if (itemOnestat == "Removed"){
                    System.out.println("2."+itemTwo+" --- $"+itemTwoprice);
                    System.out.println("Quantity: "+itemTwoquant);
                    System.out.println("Item Description: "+itemTwodescription);}
                    //Displays only Item 1, if Item 2 got removed
                    if (itemTwostat == "Removed"){
                    System.out.println("1."+itemOne+" --- $"+itemOneprice);
                    System.out.println("Quantity: "+itemOnequant);
                    System.out.println("Item Deescription: "+ itemOnedescription);}

                        {
                        //Prompts User if they want to go back
                        System.out.println("Would you like to go back to the main menu? ['Y/N']");
                        String goBack = scanner.nextLine();
                        if (goBack.equalsIgnoreCase("Y")){
                            loop = "true";
                            } 
                        }  
                    }
                }
            } 
            //Delete items
            if (userInput == 2) {
                System.out.println("You have chosen to remove an item. Continue? ['Y/N']");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    loop="false";
                    System.out.println("What item do you want to remove?");
                    System.out.println("1."+itemOne+" --- $"+itemOneprice);
                    System.out.println("Quantity: "+itemOnequant);
                    System.out.println("2."+itemTwo+" --- $"+itemTwoprice);
                    System.out.println("Quantity: "+itemTwoquant);
                    System.out.println("What item would you like to remove?");
                    String goBack = scanner.nextLine();{

                        //Deletes Item 1
                        if (goBack.equalsIgnoreCase("1")) {
                            System.out.println("Item 1 Removed");
                            itemOnestat = "Removed";
                            loop = "true";
                        }
                    }
                            {
                        //Deletes Item 2
                        if (goBack.equalsIgnoreCase("2")){
                            System.out.println("Item 2 Removed");
                            itemTwostat = "Removed";
                            loop = "true";
                        }
                    }
                }
            }
            //Edit items
            if (userInput == 3) {
                System.out.println("You have chosen to edit an item. Continue? ['Y/N']");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    if (itemOnestat == "Available" & itemTwostat == "Available"){
                        loop = "false";

                        //shows all possible items user can edit
                        System.out.println("1."+itemOne+" --- $"+itemOneprice);
                        System.out.println("Quantity: "+itemOnequant);
                        System.out.println("2."+itemTwo+" --- $"+itemTwoprice);
                        System.out.println("Quamtity: "+itemTwoquant);
                        System.out.println("");

                        //prompts user to chose what item to edit
                        System.out.println("What item do you want to edit?");
                         confirmedEdit = scanner.nextLine();
                        loop = "false";

                    //ONLY shows item 2, since 'itemOnestat' = 'Removed'
                    if (itemOnestat == "Removed"){
                        System.out.println("2."+itemTwo+" --- $"+itemTwoprice);
                        System.out.println("Quantity: "+itemTwoquant);
                        System.out.println("");

                        //prompts user to chose what item to edit
                        System.out.println("What item do you want to edit?");
                        confirmedEdit = scanner.nextLine();
                        loop = "false";

                    //ONLY shows item 1, since 'itemTwostat' = 'Removed'
                    if (itemTwostat == "Removed"){
                        System.out.println("1."+itemOne+" --- $"+itemOneprice);
                        System.out.println("Quantity: "+itemOnequant);
                        System.out.println("");

                        //prompts user to chose what item to edit
                        System.out.println("What item do you want to edit?");
                        confirmedEdit = scanner.nextLine();
                        loop = "false";
                        }
                    }
                }
                {
                    //promts user to chose what part of item 1 they want to edit
                    if (confirmedEdit.equalsIgnoreCase("1")){
                       System.out.println("1.Product name");
                       System.out.println("2.Price");
                       System.out.println("3.Quanity");
                       System.out.println("4.Product Description");
                       System.out.println("");
                       System.out.println("What do you want to edit?");
                       confirmedEdit = scanner.nextLine();

                        //prompts user to enter new name for item 1 if 'Product name' is selected
                        if (confirmedEdit.equalsIgnoreCase("1")){
                        System.out.println("Please Enter new Product Name:");
                        confirmedEdit = scanner.nextLine();
                        newName = confirmedEdit;
                        itemOne = newName;}
                        newName = ("");//clears newName variable
                        loop = "true";

                        //prompts user to enter the new price for item 1 if 'Price' is selected
                        if (confirmedEdit.equalsIgnoreCase("2")){
                        System.out.println("Please enter new price:");
                        confirmedEdit = scanner.nextLine();
                        newPrice = Integer.parseInt(confirmedEdit);
                        itemOneprice = newPrice;}
                        newPrice = 0;
                        loop = "true";

                        //prompts user to enter the new quantity for item 1 if 'Quantity' is selected
                        if (confirmedEdit.equalsIgnoreCase("3")){
                        System.out.println("Please enter new quantity:");
                        confirmedEdit = scanner.nextLine();
                        newQuant = Integer.parseInt(confirmedEdit);
                        itemOnequant = newQuant;}
                        newQuant = 0;
                        loop = "true";
                        
                        //prompts user to enter the new description for item 1 if 'Description is selected'
                        if (confirmedEdit.equalsIgnoreCase("4")){
                        System.out.println("Please enter new description:");
                        confirmedEdit = scanner.nextLine();
                        newDescription = confirmedEdit;
                        itemOnedescription = newDescription;}
                        newDescription = "";
                        loop = "true";
                        }
                    {
                        //promts user to chose what part of item 2 they want to edit
                        if (confirmedEdit.equalsIgnoreCase("2")){    
                        System.out.println("1.Product name");                
                        System.out.println("2.Price");
                        System.out.println("3.Quanity");
                        System.out.println("4.Product Description");
                        System.out.println("");
                        System.out.println("What do you want to edit?");
                        confirmedEdit = scanner.nextLine();
                    
                    
                        //prompts user to enter new name for item 2 if 'Product name' is selected
                        if (confirmedEdit.equalsIgnoreCase("1")){
                        System.out.println("Please Enter new Product Name:");
                        confirmedEdit = scanner.nextLine();
                        newName = confirmedEdit;
                        itemTwo = newName;}
                        newName = ("");//clears newName variable
                        loop = "true";
                        
                        //prompts user to enter the new price for item 2 if 'Price' is selected
                        if (confirmedEdit.equalsIgnoreCase("2")){
                        System.out.println("Please enter new price:");
                        confirmedEdit = scanner.nextLine();
                        newPrice = Integer.parseInt(confirmedEdit);
                        itemTwoprice = newPrice;}
                        newPrice = 0;
                        loop = "true";

                        //prompts user to enter the new quantity for item 2 if 'Quantity' is selected
                        if (confirmedEdit.equalsIgnoreCase("3")){
                        System.out.println("Please enter new quantity:");
                        confirmedEdit = scanner.nextLine();
                        newQuant = Integer.parseInt(confirmedEdit);
                        itemTwoquant = newQuant;}
                        newQuant = 0;
                        loop = "true";
                        
                        //prompts the user to enter the new description for item 2 if 'Description' is selected
                        if (confirmedEdit.equalsIgnoreCase("4")){
                        System.out.println("Please enter new description:");
                        confirmedEdit = scanner.nextLine();
                        newDescription = confirmedEdit;
                        itemTwodescription = newDescription;}
                        newDescription = "";
                        loop = "true";
                }
            }      
        }

                        }
                    }           {     
            //Exit Inventory System
            if (userInput == 4) {
                System.out.println("Exiting Marlon's Inventory System. Goodbye!");
                break;
            }
            else {
              System.out.println("Invalid input. Please try again.");
                }
            }
        }scanner.close();
    }
}
