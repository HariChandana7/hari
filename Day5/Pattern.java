import java.io.*;
import java.util.*;
 public class  Pattern
 {
     public static void main(String... args)
     {
          Scanner sc = new Scanner(System.in);
            String s = sc.next();       
            for(int i=1 ;i<=5 ;i++)
              {
                for(int j=1 ;j<=i;j++)
                  {
                                       System.out.print( s+" ");
                 }
                System.out.println( );
             }
         }
  }
  
//Output 1:
//# -------> User input 
//#
//# #
//# # #
//# # # #
//# # # # #

//Output 2:
//7 --------> User input 
//7
//7 7
//7 7 7
//7 7 7 7
//7 7 7 7 7