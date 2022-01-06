/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/05/2021
*
*@Teacher: A. Correiro
*
*@File Name: MathClassExamples4.java
*
*Program Description:
This program calculates the total monies earned off an investment P, at an annual interest rate i, for a period of n years.. 
*****************************************************************************************************************/

import java.lang.Math;
import java.util.Scanner;

class MathClassExamples4 {
   public static void main(String [] arg) {
   
      double principleAmount = 0;
      double interestRate = 0;
      int years = 0;
      double formula = 0;
      double amount = 0;
      String word = "%/a";
    
      
      Scanner uI = new Scanner (System.in);
      
      System.out.print("Enter the initial principle amount: ");
      principleAmount = uI.nextDouble( );
       
      System.out.print("Enter the annual interest rate: ");
      interestRate = uI.nextDouble( );
       
      System.out.print("Enter the number of years of your investment: ");
      years = uI.nextInt( );
       
      formula = (1+(interestRate/100d));
      amount = (principleAmount*Math.pow(formula, years));
   
   
   // 
      System.out.printf("%.2f invested at %.2f %s for %d years is %.2f", principleAmount, interestRate, word, years, amount); 
   
   }  // --- end of main() method ---
}  // --- end of MathClassExamples4 ---