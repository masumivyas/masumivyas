/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/24/2021
*
*@Teacher: A. Correiro
*
*@File Name: DoWhileStatementMasumi.java
*
*Program Description: This is a program that creates a menu system using a do while statement. 
*****************************************************************************************************************/

import java.util.Scanner;
class DoWhileStatementsMasumi {
  public static void main(String [] args) throws Exception {
    
    // Variable Declaration & Initialization
    String fileName = "";
    int selection = 1;
    Scanner in = new Scanner(System.in);
    
    // User Input / Program Execution Section / Program Output Section

    do {
    System.out.println("\n\n====MENU --- PLEASE SELECT ONE --------------------");
    System.out.println("1. Load/Open a file\n2. Save a File to disk\n3. Sort Names Alphabetically\n4. Exit Program");
    while (!in.hasNextInt()) {
      System.out.print("Please select only one of the options from the list by entering a corresponding number.\n Please try again"); // instruction message output for users
      in.next();
      
      }
      selection = in.nextInt();
      if (selection >= 5 || selection <= 0) // program checks if input is out of range
         System.out.print("Please select only one option from the list by entering a corresponding number.");
      else if (selection == 1 || selection ==2) {
         System.out.print("Please enter a file name: \n"); // instruction message output for users
         do {
            fileName = in.next();
            if (fileName.length() > 10) // progra, checks to see if file name is larger than 10 characters
               System.out.print("The file name " + fileName + " is too long. Please try again:\n "); // outputs message to user so they can enter an accepted name
            else
               if (selection == 1)
                  System.out.print("Opening " + fileName );
               else 
                  System.out.print("Saving " + fileName );
           } while (fileName.length() > 10 || fileName.length() < 1); // checks to see if the condition is true to restart loop
       } else if (selection == 3)
            System.out.print("Sorting Alphabetically ");
       else if (selection == 4)
            System.out.print ("Good - Bye \n\n");
       } while (selection !=4 || selection < 1 || selection > 4); // checks to see if the condition is true to restart loop
        
 
}    // end of main method
}    // end of ProblemSet18Ex1
