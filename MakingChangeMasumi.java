/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/14/2021
*
*
*
*@File Name: MakingChangeMasumi.java
*
*Program Description:
This program determines the change to be dispensed from a vending machine for an item in the machine that can cost between 2 cents and a dollar.. 
*****************************************************************************************************************/

import java.util.Scanner;

class MakingChangeMasumi {
   public static void main(String [] arg) {
   
   //--- Variable declaration and initialization 
   
      int price = 0;
      int change = 0;
      Scanner uI = new Scanner (System.in);   
   
   // --- User input
      
      
      System.out.printf("You have 1 dollar.\nPlease enter a product amount between 2 cents and a dollar as an integer to calculate your change \n");
      System.out.printf("For example enter 25 for 25 cents or 1 for a dollar. ");
      price = uI.nextInt( );
              
   // --- Program Execution    
    
      change = 100-price;
                 
   // --- Program Output
      if (price==1){
         System.out.printf("\nYou get no change. Your item costs a dollar.");
      } else if (price>=2 && price <=99) {
         System.out.printf("\nYour change is %s cents and you will get back:\n%s quarter(s)\n%s dime(s)\n%s nickel(s)\n%s penny(s)\n", change, change/25, change % 25 /10, change %25 % 10 / 5, change % 25 %10 %5 /1);
      } else {
         System.out.printf("\nYour product is out of range.");
      } 
   
   
        
   }  // --- end of main() method 
}  // --- end class MakingChangeMasumi 

   
