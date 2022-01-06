/****************************************************************
*@Author: Masumi Vyas @Date: 04/21/2021
*
*@Teacher: A. Correiro
*
*@File Name: AttendanceMasumiVyas.java
*
*Program Description:
* This program is an example of a class attendance list
*****************************************************************/


class AttendanceMasumiVyas { //open class

   public static void main(String[]args){ //open main ()
   
   // --- Declaration and Initialization 
       
      double z = 0.5;
    
      String a = "Class Attendance ", b = "Masumi", c = "Vyas";
      String e = "Mon", f = "Tue", g = "Wed", h = "Thu", i = "Fri";
      String j = "Andrew", k = "Carreiro";
      String m = "Sabastian", n = "Patrizio-Corbasson";
      String p = "P", A = "A", L = "L";
      String q = "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
      String T = "Total", x = "0123456789", y = "9876543210", zero = "0", two = "2", one = "1", w = "353332950";
      String D = "Date: 04/21/2021"; 
   
    // --- Program Output
     
      System.out.printf("%90.16s\n", D);
      System.out.printf("%-90.16s\n%s\n",a, q);
      System.out.printf("%-24.22s%-24.22s%-23.21s%-4.3s%-4.3s%-4.3s%-4.3s%-3.3s\n%s\n",b, c, w, e, f, g, h, i, q);
      System.out.printf("%-24.22s%-24.22s%-24.21s%-4.1s%-4.1s%-4.1s%-4.1s%-4.1s\n",j, k, x, p, p, p, A, p );
      System.out.printf("%-24.22s%-24.22s%-24.21s%-4.1s%-4.1s%-4.1s%-4.1s%-4.1s\n%s\n",m, n, y, A, p, L, A, A, q);
      System.out.printf ("%-72.5s%-4.1s%-4.1s%-4.1f%-4.1s%-4s\n", T, one, zero, z, two, one);
      
   }//end main ()

      
}//end class AttendanceMasumiVyas


