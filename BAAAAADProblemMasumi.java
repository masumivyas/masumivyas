/************************************************************************************************************************
*@Author: Masumi Vyas @Date: 05/25/2021
*
*@Teacher: A. Correiro
*
*@File Name: BAAAAADProblemMasumi.java
*
*Program Description: This is a program that creates a menu system using a do while statement. 
*****************************************************************************************************************/
import java.lang.Math;

class BAAAAADProblemMasumi {

public static void main(String[] args){

    for(double t = 0; t <= 25; t++) {

        double N =  220 / (1 +10 * (Math.pow(.83, t)));
        System.out.printf("%.2f,%.2f\n",t, N);

    }
  }
}
