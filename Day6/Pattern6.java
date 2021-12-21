//

import java.util.*;
class Pattern6
{
   public static void main(String... args)
    {
     Scanner sc =new Scanner(System.in);
       int rows = sc.nextInt();
         for(int i=1 ; i<=rows;i++)
           {
            for(int k=rows ;k>=1 ;k--)
            {
                if(k==1 || k==i || i==rows)
                        System.out.print( " "+i);
                else
                      System.out.print("  ");
                }
            
              System.out.println();
          }
      }
}

//Output :
//5
//                1
//          2   2
//       3      3
//   4          4
// 5 5 5 5 5