/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/05/2021
*
*
*
*@File Name: FlowToJavaMasumi.java
*
*Program Description:
This program calculates the total monies earned off an investment P, at an annual interest rate i, for a period of n years.. 
*****************************************************************************************************************/

import java.util.Scanner;

class FlowToJavaMasumi {
   public static void main(String [] arg) {
   
       int x = 0;
       int y = 0;
      
      Scanner uI = new Scanner (System.in);
      
      System.out.println ("Please enter the last grade you got on an assignment. ");
      x = uI.nextInt();
       
      if (x > 49 & x < 60) {
            System.out.println ("You recieved a level 1.");
      }
      
      else if (x > 59 & x < 70) {
         System.out.println ("You recieved a level 2.");
      }
 
      else if (x > 69 & x < 80) {
         System.out.println ("You recieved a level 3.");
      }

      else if (x > 79 & x < 101) {
         System.out.println ("You recieved a level 4.");
      }

   
  
    
   }  // --- end of main() method ---
}  // --- end of FlowToJavaMasumi ---