/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/05/2021
*
*@Teacher: A. Correiro
*
*@File Name: MathClassExamples1.java
*
*Program Description:
This program calculates the area of a circle. 
*****************************************************************************************************************/

import java.lang.Math;
import java.util.Scanner;

class MathClassExamples1 {
  public static void main(String [] arg) {
  
    double radius = 0;
      
      Scanner uI = new Scanner (System.in);
      
       System.out.print("Please enter a radius value: ");
       radius = uI.nextDouble( );

  // 
  System.out.printf("Area of circle with radius %.2f equal %.2f \n", radius, Math.PI*radius*radius); 
  
  }  // --- end of main() method ---
}  // --- end of MathClassExamples1 ---