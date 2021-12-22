//Alphabet Pattern...

import java.util.Scanner;
public class Pattern13
{
      public static void main(String[] args)   
      {  
       Scanner sc =new Scanner(System.in);
       int rows=sc.nextInt();    
       int chvalue =65;      
       for (int i=0; i <= rows; i++)   
     {  
          for (int j = 0; j <= i; j++)   
           {   
           System.out.print((char)(chvalue +j)+" ");   
            }               
          System.out.println();   
      }   
   }
}

/* Output :
 5
A
A B
A B C
A B C D
A B C D E
A B C D E F

*/