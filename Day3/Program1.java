import java.util.*;
import java.io.*;
class Program1
 {
  public static void main(String... args)
  {
          
       Scanner num =new Scanner(System.in);
       int T =  num.nextInt();
       for(int i=0 ;i<T ;i++)
       {            
          try
          { 
              long n= num.nextLong();            
              System.out.println(n+" can be fitted in : ");
              if(n>= -128 && n<= 127)  System.out.println(" * Byte ");
              if(n>= -32768 && n<= 32767)  System.out.println(" * Short ");
              if(n>= -2147483648 && n<= 214748367)  System.out.println(" * Int ");
              System.out.println(" * Long ");
          }
          catch(Exception e )
           {
                     System.out.println(num.next()+ " can't be fitted anywhere");
            }
         }
    }
}

/* Output :
   5
-92
-92 can be fitted in :
 * Byte
 * Short
 * Int
 * Long
347
347 can be fitted in :
 * Short
 * Int
 * Long
347527
347527 can be fitted in :
 * Int
 * Long
123235347134246459
123235347134246459 can be fitted in :
 * Long
23513443733653863901234567
23513443733653863901234567 can't be fitted anywhere 
 */
