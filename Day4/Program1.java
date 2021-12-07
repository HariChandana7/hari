import java.io.*;
import java.util.*;

public class Program1
{
   public static void main(String... args)
   {
        Scanner sc=new Scanner(System.in);
         String A =sc.next();
          String B =sc.next();
         System.out.println(A.length() + B.length() );
          if(A.compareTo(B) >0)
             {
                  System.out.println("YES ");
              }
          else {
                      System.out.println("NO ");
                   }
       System.out.println(A.substring(0,1).toUpperCase() + A.substring(1)+" " +B.substring(0,1).toUpperCase() +B.substring(1) );
     }
 }
   
//Output 1 :
//summer
//winter
//12
//NO
//Summer Winter

//Output 2 :
//jack
//hack
//8
//YES
//Jack Hack