/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/07/2021
*
*@Teacher: A. Correiro
*
*@File Name: SphereInCubeMasumi.java
*
*Program Description:
This program calculates the left over volume of a cube that holds a sphere with a diameter of the length of the cube. 
*****************************************************************************************************************/

import java.lang.Math;
import java.util.Scanner;

class SphereInCubeMasumi {
   public static void main(String [] arg) {

//--- Variable declaration and initialization 

      int length = 0;
      double volumeSphere = 0;
      double volumeNoSphere = 0;
      double volumeCube = 0;
      double radius = 0;
     
   
   // --- User input
      
      Scanner uI = new Scanner (System.in);
      System.out.print("Please enter the length of one side of the cube (cm): ");
      length = uI.nextInt( );
              
   // --- Program Execution    
    
      radius = (length/2d) ;
      volumeSphere = (4d/3)*(Math.PI)*(Math.pow(radius,3));
      volumeCube = Math.pow(length,3);
      volumeNoSphere = volumeCube - volumeSphere;
         
   // --- Program Output
   
      System.out.printf("The volume of a sphere with a diameter of %d is %.2fcm^3 \n", length, volumeSphere);
      System.out.printf("The volume of a cube with a side length of %d is %.2fcm^3 \n", length, volumeCube);
      System.out.printf("The volume of the cube minus the displaced volume of the sphere is %.2fcm^3", volumeNoSphere); 
   
   }  // --- end of main() method 
}  // --- end class SphereInCubeMasumi 

   
