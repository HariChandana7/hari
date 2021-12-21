// Hollow Half Pyramid...

import java.util.*;
class Pattern5
{
   public static void main(String... args)
    {
     Scanner sc =new Scanner(System.in);
       int rows = sc.nextInt();
         for(int i=1 ; i<=rows;i++)
           {
            for(int k=1 ;k<=i ;k++)
            {
                if(k==1 || k==i || i==rows)
                        System.out.print( " "+k);
                else
                      System.out.print("  ");
                }
            
              System.out.println();
          }
      }
}

// Output :
//5 --------> user input.
// 1
// 1 2
// 1    3
// 1        4
// 1 2 3 4 5
