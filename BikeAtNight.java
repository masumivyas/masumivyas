/*
*@Author: Masumi Vyas @Date: 05/25/2021
*
*
*@File Name: BAAAAADProblemMasumi.java
*
*Program Description: This is a program that indicates if one can ride a bike given the conditions.
*****************************************************************************************************************/
import java.util.Scanner;
class BikeAtNight{
   public static void main (String [] args){
   //--Variable Declaration
      Scanner userInput = new Scanner (System.in);
      boolean hasBike;
      boolean hasHelmet;
      boolean cannotBike;
      boolean cannotBikeDeMorgan;
      boolean hasHelmetLight;
      boolean hasBikeLight;
      boolean cannotBikeAtNight;
      
   // -- User Input and Variable initialization
      System.out.print("Do you have a bike? Enter true or False ");
      hasBike = userInput.nextBoolean();
      System.out.print("Do you have a Helmet? Enter true or False ");
      hasHelmet = userInput.nextBoolean();
      System.out.print("Do you have a Helmet light? Enter true or False ");
      hasHelmetLight = userInput.nextBoolean();
      System.out.print("Do you have a Bike Light? Enter true or False ");
      hasBikeLight = userInput.nextBoolean();

      
   //-- Negating an And Statement
      cannotBike = !(hasBike && hasHelmet);
      cannotBikeDeMorgan = !hasBike || !hasHelmet;
      cannotBikeAtNight = ((!(hasBike && hasHelmet))||(!hasBikeLight || !hasHelmetLight));
      
   // -- Program Output
   
      if (cannotBike){
         System.out.println("You may not bike.");
      }else{
         System.out.println ("You may Bike!");
      }  
      if (cannotBikeDeMorgan){
         System.out.println("You may not bike with DeMorgan.");
      }else{
         System.out.println ("You may Bike with DeMorgan!");
      }
       if (cannotBikeAtNight){
         System.out.println("You may not bike at night.");
      }else{
         System.out.println ("You may Bike at night!");

}
}
}

