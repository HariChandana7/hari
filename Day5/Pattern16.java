import java.util.Scanner;
public class Pattern16
{
  public static void main(String... args)
   {
     Scanner sc =new Scanner(System.in);
       int n =sc.nextInt();
       int chvalue = 65;
        for(int i=n;i>=1 ;i--)
         {
          for(int j=0;j<=i;j++)
           {
              System.out.print((char)(chvalue+j)+ " ");
             }
             System.out.println();
         }
      for(int i=1;i<=n ;i++)
         {
          for(int j=0;j<=i;j++)
           {
              System.out.print((char)(chvalue+j)+ " ");
             }
       System.out.println();
     }
    sc.close();
  }
 }

/*  Output :
A B C D E F
A B C D E
A B C D
A B C
A B
A B
A B C
A B C D
A B C D E
A B C D E F
 
*/