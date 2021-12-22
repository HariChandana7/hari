//Hollow Inverted Half Pyramid.....

import java.util.Scanner;
class Pattern3
{
    public static void main(String args[])
     {
       Scanner sc=new Scanner(System.in);
         int n= sc.nextInt();
          for(int i=1 ;i<=n ;i++)
          {
             for(int j=i ;j<=n ;j++)
              {
                if (i == 1 || j==n  ||  j==i)
                           System.out.print(j + " ");
                 else
                            System.out.print("  ");
                }
                System.out.println();
           }
       }
}

//Output :
//5
//1 2 3 4 5
//2        5
//3    5
//4 5
//5