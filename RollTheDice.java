/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/11/2021
*
*
*@File Name: RollTheDice.java
*
*Program Description:
User will guess a number between 1 and 6. Then the computer will randomly generate a number, and if the numbers match then it's a win.
*****************************************************************************************************************/

import java.util.Scanner;
import java.util.Random;

class RollTheDice {
   public static void main(String [] arg) {
   
   Random rand = new Random();
    int upperbound = 7;
    int lowerbound = 0;
    int random = rand.nextInt(upperbound); 
   
       int dice = 0;
       
      
      Scanner uI = new Scanner (System.in);
      
      { 
               System.out.println("You did not enter an integer as a play. Please play again."); // checks if user put a valid input
               uI.next(); // moves the scanner input into the next token
            } 
         
            play = uI.nextInt(); // takes user input for user play 
            if (play < 1 || play > 3) { // checks if number inputted is a play that corresponds to rock paper or scissors
               System.out.println("That is not a play. Please play again.");
            }
            else {
               comp = (int)(Math.random()*3+1);
               System.out.println("The computer plays: "+comp);
            }
         
      
      System.out.println ("Please enter a number that is present on a dice (1-6). \n If it matches the random number generator, you win!");
      dice = uI.nextInt();
       
      if (dice == random) {
            System.out.println ("Congrats you win!");
      }
      
      else if (dice != random) {
         System.out.println ("Sorry, you lose.");
      }
   
   System.out.println("The random number generator generated number "+random+".");

      }  // --- end of main() method ---
}  // --- end of RollTheDice ---