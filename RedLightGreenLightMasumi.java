/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/18/2021
*
*@Teacher: A. Correiro
*
*@File Name: RedLightGreenLightMasumi.java
*
*Program Description: This is a program that simulates being at a traffic intersection.

*****************************************************************************************************************/

import java.util.Scanner;

public class RedLightGreenLightMasumi {

   public static void main(String [] arg) throws Exception{
   
   //Variable Declaration & Initialization
      boolean greenLight;
      boolean oncomingTraffic;
      boolean advanceLight;
      boolean makeLeft = true, makeRight = true, goStraight = true, mustStop = true;
      int dayOfWeek;
      Scanner uI = new Scanner(System.in);
   
   // User Input Section
      System.out.print("Advance Light = ");
      advanceLight = uI.nextBoolean();
      System.out.print("Green Light = ");
      greenLight = uI.nextBoolean();
      System.out.print("Oncoming Traffic = ");
      oncomingTraffic = uI.nextBoolean();
      System.out.print ("The day of the week = ");
      dayOfWeek = uI.nextInt();
   
   // Program Execution Section
      if (dayOfWeek >= 2 && dayOfWeek <=6) { // program checks the day that is inputted (days 2-6 are weekdays)
         if (advanceLight == true || (oncomingTraffic == false && greenLight == true)) {
            makeLeft = true;
            mustStop = false;
         
         } else {
            makeLeft = false;
            mustStop = true;
        
         }
         if (greenLight) {
            makeRight = true;
            goStraight = true;
            mustStop = false;
         
         }else {
            makeRight = false;
            goStraight = false;
            mustStop = true;
         }
      
      } else if (dayOfWeek == 1 || dayOfWeek == 7) { // Program checks the day that is inputted (days 1 & 7 are weekends)
         makeLeft = false;
      
         if (greenLight) {
            makeRight = true;
            goStraight = true;
            mustStop = false;
         
         } else {
            makeRight = false;
            goStraight = false;
            mustStop = true;
         
         }
      } else {
         System.out.println("This day does not exist, please try again."); // incase user inputs a day that does not exist, this message will be relayed to them.
      
      }
   
   
   // Program Output Section
   
      System.out.println("===================================");
      System.out.println("You can make a left = " + makeLeft );
      System.out.println("You can make a right = "+ makeRight );
      System.out.println("You can go straight = " + goStraight );
      System.out.println("You must stop = " + mustStop );
   
   
   }// end of main method
}// end of RedLightGreenLightMasumi
         
   
   
   
