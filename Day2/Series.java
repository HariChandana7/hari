import java.util.*;
import java.io.*;
class Series
{
 public static void main(String... args)
 {
  Scanner  sc =new Scanner(System.in);
   int t=sc.nextInt();
   for(int i=0 ;i<t ;i++)
   {
      int x =sc.nextInt();
      int y =sc.nextInt();
      int n =sc.nextInt();
       for(int k=0 ;k<n ;k++)
       {
           int  s = x+((int)Math.pow(2,k)*y);
          System.out.print(s+"  ");
       }
      System.out.println();
    }
  }
}   

// Output :
//input
//2
//2 3 5 1 2 10
//output
//5 8 14 26 50
//3 5 9 17 33 65 129 257 513 1025


   