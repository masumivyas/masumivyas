/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/07/2021
*
*@Teacher: A. Correiro
*
*@File Name: MonthlyPaymentCalculatorMasumi.java
*
*Program Description:
This program calculates the monthly payment on a loan of an amount specified by the user.
*****************************************************************************************************************/

import java.lang.Math;
import java.util.Scanner;

class MonthlyPaymentCalculatorMasumi {
   public static void main(String [] arg) {
   
   //--- Variable declaration and initialization 
   
      double principleAmount = 0;
      int years = 0;
      double interest = 0;
      double formula = 0;
      double paymentAmount = 0;
      String percentage = "%";
   
   
   // --- User input   
     
      Scanner uI = new Scanner (System.in);
           
      System.out.print("Please enter the principle amount of the product you would like to buy: ");
      principleAmount = uI.nextDouble( );
       
      System.out.print("Please enter the number of years the loan will be for: ");
      years = uI.nextInt( );
      
      System.out.print("Please enter the yearly interest for the product: ");
      interest = uI.nextDouble( );
       
   // --- Program Execution 
             
      formula = 1+(interest/(100*12d));
      paymentAmount = principleAmount* ((interest/(100*12d)) / (1-(Math.pow(formula, (-1d)*years*12d))));
         
   // --- Program Output
   
      System.out.printf("For the amount of %.2f at a %.2f%s per year for %d years, the monthly payment will be $%.2f", principleAmount, interest, percentage, years, paymentAmount); 
   
   }  // --- end of main() method 
   
}  // --- end class MonthlyPaymentCalculator