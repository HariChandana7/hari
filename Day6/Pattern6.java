//Hollow Full Pyramid..

import java.util.*;
class Pattern6
{
   public static void main(String... args)
    {
     Scanner sc =new Scanner(System.in);
       int rows = sc.nextInt();
         for(int i=1; i<=rows;i++)
           {
            for(int k=i ;k<rows ;k++)
            {
                 System.out.print("  ");
             } 
          for(int k=1 ;k<=i ;k++) 
            {
                  if(k==1 ||  k== rows)
                              System.out.print(k+"  ");
                  else  
                          System.out.print("  ");
             }        
              for(int k=1; k<i ;k++) 
               {
                      if(k== i-1 &&  k< rows-1)
                             System.out.print(k+1);
                       else
                             System.out.print("  ");
               }     
              System.out.println( );
          }
      }
}

//Output:
//5
