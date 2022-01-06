/*@Author: Masumi Vyas @Date: 05/25/2021
*
*
*@File Name: challengequestion.java
*
*Program Description: This program solves for area of circle after inputting radius
*****************************************************************************************************************/
import java.util.Scanner;

class challengequestion {

   public static void main(String [] args) {
   
   //--- variable declaration and initialization 
   
      int radius = 0;
      double area = 0;
      double pi = 3.1415;
      Scanner uI = new Scanner (System.in);
   
   // --- User input
   
      System.out.println("Enter the radius of the circle to calculate its area");
      radius = uI.nextInt( );
   
   // --- Program Execution
   
      area = pi*radius*radius;
   
   // --- program output 
      System.out.printf("The area of the circle with radius %d is %.1f", radius, area);
   
   }
}