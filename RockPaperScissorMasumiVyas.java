/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/29/2021
*
*@Teacher: A. Correiro
*
*@File Name: RockPaperScissorsMasumiVyas.java
*
*Program Description: This is a program where the user is able to play a game of rock paper scissors.  
*****************************************************************************************************************/

import java.lang.Math;
import java.util.Scanner;

class RockPaperScissorsMasumiVyas {
   public static void main(String [] arg) {

//--- Variable declaration and initialization 

   Scanner uI = new Scanner(System.in);
    string name = 0;
    int play = 0;
    int win = 0;
    int lose = 0;
    int count = 0;
  
    Random rand = new Random();
    int upperbound = 4; // where 1 = rock, 2 = scissors, 3 = paper
    int lowerbound = 0;
    int random = rand.nextInt(upperbound); 
    string playAgain = 0;

do {
    System.out.println("\n\n====MENU========\n--- PLEASE SELECT ONE TO PLAY ROCK PAPER SCISSORS--------------------");
    System.out.println("1 = Rock\n2 = Paper\n3 = Scissors"); // outputs options for user
while (!in.hasNextInt()) {
      System.out.print("Please select only one of the options from the list by entering a corresponding number.\n Please try again"); // instruction message output for users
      in.next();    
      }
      selection = in.nextInt();
      if (play >= 4 || play <= 0) // program checks if input is out of range
         System.out.print("Invalid. Please select only one option from the list by entering a corresponding number.");
      else if (play == random) {
         System.out.print("Tie. Please enter another play where 1 = rock, 2 = paper, and 3 = scissors. ");   
       } else if (play <= 3 || play >= 1) {
            System.out.print("Invalid Input. Please Try Again ");
            
       } else if (random == 1 || play == 3) || (random == 3 || play == 2) || (random  == 2|| play == 1) ){
         System.out.print("You lose"); 
       }   else if (random == 2 || play == 1) {
         System.out.print("You win"); // instruction message output for users
       }   else if (random == 2 || play == 3) {
         System.out.print("You win"); // instruction message output for users
             }
}
}    
}        
            
      