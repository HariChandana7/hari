import java.io.*;
import java.util.*;
// prime numbers 

 class Program5
 {
    public static void main(String... args)
     {
          boolean checkPrime = true;
         Scanner sc = new Scanner(System.in);
           int num = sc.nextInt();
            int a=2; 
           while(a <= num/2) {
               if( num %a==0)  
                          {
                         checkPrime = false;
                         }
             a++;
           }
        if (checkPrime)
             System.out.println(num +" Is a Prime");
         else
             System.out.println(num +" Is not a Prime");
        sc.close();
      }
 }

//Output 1:
//19
//19 Is a Prime

//Output 2:
//256
//256 Is not a Prime


    