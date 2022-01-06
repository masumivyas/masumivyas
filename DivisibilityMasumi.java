/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/18/2021
*
*@Teacher: A. Correiro
*
*@File Name: DivisibilityMasumi.java
*
*Program Description: This is a program that asks for a dividend and a divisor from the user as an integer input and
then determines if the dividend is divisible by the divisor.

*****************************************************************************************************************/

import java.util.Scanner;

class DivisibilityMasumi {

   public static void main (String [] args) {
   
   //Variable Declaration & Initialization
      int dividend = 0;
      int divisor = 0;
      int value = 0;
   
   
    // User Input Section
      
      Scanner uI = new Scanner (System.in);
      System.out.print("Please enter the dividend: ");
      dividend = uI.nextInt( );
      System.out.print("Please enter the divisor: ");
      divisor = uI.nextInt( );
      
   // Program Execution Section / Program Output Section

   
   
      if (divisor == 0) {
         System.out.printf("%d is not divisible by %d.", dividend, divisor); // prevents the program from crashing if the user enters a 0 as a divisor.
      } else if (value == (dividend%divisor)) { 
         System.out.printf("%d is divisible by %d.", dividend, divisor); 
      } else
         System.out.printf("%d is not divisible by %d.", dividend, divisor);
         
   
  }  // --- end of main() method 
}  // --- end class DivisibilityMasumi




   
