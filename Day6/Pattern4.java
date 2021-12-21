// Full Pyramid...

import java.util.*;
class Pattern5
{
   public static void main(String... args)
    {
     Scanner sc =new Scanner(System.in);
       int rows = sc.nextInt();
         for(int i=rows ; i>=1;i--)
          {
            for(int k=1;k< i ;k++)
            {
                System.out.print(i +" ");
            }
              System.out.println();
          }
      }
}

// Output :
