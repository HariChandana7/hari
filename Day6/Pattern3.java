//Hollow Half Pyramid...
import java.util.*;
class Pattern3
{
  public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
      int rows =sc.nextInt();
       for(int i=1 ;i<=rows ;i++)
         {
           for(int j=i;j<=rows;j++)
           {
               System.out.print(" ");
            }
         for(int k=1 ;k<=(2*i-1); k++)
          {
               if(i == rows || k ==1 || k == rows)
                {
                 System.out.print(k+ " " );
                 }
                else {
                     System.out.print(" "); 
                 }
           }
      System.out.println();
    }
    }
}

          