/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/05/2021
*
*@Teacher: A. Correiro
*
*@File Name: MathClassExamples3.java
*
*Program Description:
This program calculates the square root of an integer between 0 and 100. 
*****************************************************************************************************************/
import java.lang.Math;
import java.util.Scanner;

class MathClassExamples3 {
  public static void main(String [] arg) {
  
    int integer = 0;
      
      Scanner uI = new Scanner (System.in);
      
       System.out.print("Please enter an integer between 0 and 100: ");
       integer = uI.nextInt( );

  // 
  System.out.printf("The square root of %d is %.2f", integer, Math.sqrt(integer));
    }  // --- end of main() method ---
}  // --- end of MathClassExamples3 ---