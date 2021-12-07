import java.util.*;
import java.io.*;
 class Program4
  {
   public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
        sc.close();
            if(n>= -100  &&  n<=100)
            {
                   String str = Integer.toString(n);
                               if(n == Integer.parseInt(str)) {
                                               System.out.println("Good Job");
                                     }
                                 else {
                                       System.out.println("Wrong answer"); 
                                    }
              }
            else{
                System.out.println(" Not in specified range ");
             }
      }
}
  // Output:
  //34
//Good Job

//356
// Not in specified range

      