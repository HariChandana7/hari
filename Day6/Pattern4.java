// Full Pyramid...

import java.util.*;
class Pattern4
{
   public static void main(String... args)
    {
      int count =0, count1=0 , k=0;
     Scanner sc =new Scanner(System.in);
       int rows = sc.nextInt();
         for(int i=1 ; i<=rows;++i)
          {
            for(int j=1;j<= rows-1 ;++j)
            {
                System.out.print("  ");
                   ++count;
            }
             while(k!= 2*i-1)
               {
                  if(count <= rows-1)
                        {  
                             System.out.print(i+k +" ");  
                               ++count;
                         }
                     else {
                           ++count1;
                              System.out.print((i+k-2*count1) +" ");
                            }
                       ++k;
                  }
                count1=count=k=0;
              System.out.println();
          }
      }
}

// Output :
