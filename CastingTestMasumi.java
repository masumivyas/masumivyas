/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 04/29/2021
*
*
*@File Name: CastingTestMasumi.java
*
*Program Description:
* This program gets a movie rating from the user as a double, and rounds it to the nearest rounding via casting technique. 
**************************************************************************************************************************/

import java.util.Scanner;

class  CastingTestMasumi { // begin class

   public static void main(String [] args) { // begin main method ()
   
   //--- Variable declaration and initialization 
   
     
      double movieRating = 0;
      int ratingRounded = 0;
      
   
      Scanner uI = new Scanner (System.in);
   
   // --- User input
   
      System.out.print("Please enter a movie rating: ");
      movieRating = uI.nextDouble( );
   
   // --- Program Execution
        
      ratingRounded = (int)(movieRating + 0.5);
      
   // --- Program output 
      System.out.printf("Rating rounded: %d", ratingRounded);
   
   } //end main()method

   
} //end class CastingTestMasumi