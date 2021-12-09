import java.io.*;
import java.util.*;
 public class  Pattern1
 {
     public static void main(String... args)
     {
          Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();       
            for(int i=0 ;i<5 ;i++)
              {
                for(int j=0 ;j<i;j++)
                  {
                                       System.out.print( num +" ");
                              num++;
                 }
                   
                System.out.println( );
             }
         }
  
//Output :
//1

//1
//2 3
//4 5 6
//7 8 9 10

//Output :
//2

//2
//3 4
//5 6 7
//8 9 10 11

  }