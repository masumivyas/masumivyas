/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/05/2021
*
*@Teacher: A. Correiro
*
*@File Name: MathClassExamples2.java
*
*Program Description:
This program calculates the volume and surface area of a circle. 
*****************************************************************************************************************/

import java.lang.Math;
import java.util.Scanner;

class MathClassExamples2 {
  public static void main(String [] arg) {
  
    int radius = 0;
      
      Scanner uI = new Scanner (System.in);
      
       System.out.print("Please enter a radius value: ");
       radius = uI.nextInt( );

  System.out.printf("A sphere with radius %d has\nsurface area %.3f squared cm and volume %.3f cubic cm", radius, 4*Math.PI*radius*radius, 4.0/3*Math.PI*radius*radius*radius); 
  
  }  // --- end of main() method ---
}  // --- end of MathClassExamples2 ---

