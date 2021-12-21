//Hollow Inverted Half Pyramid..

import java.util.*;
class Pattern7
{
   public static void main(String... args)
    {
     Scanner sc =new Scanner(System.in);
       int rows = sc.nextInt();
         for(int i=rows ; i>=1;i--)
           {
            for(int k=1 ;k<=rows ;k++)
            {
                if(k==1 || k==i || i==rows)
                        System.out.print( " "+ i);
                else
                      System.out.print("  ");
                }
            
              System.out.println();
          }
      }
}

//Output:
//5
