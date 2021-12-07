import java.io.*;
import java.util.*;

 public class Program2
 {
    public static void main(String... args)
    {
      Scanner sc =new Scanner(System.in);
        String s = sc.next();
        int  startingIndex =sc.nextInt();
        int endIndex =sc.nextInt();
        sc.close();
      
           System.out.println(s.substring(startingIndex ,endIndex));
     }
}

//Output 1:
//bangtan
//4
//7
//tan
  
//Output 2:
//exaggerated
//4
//9
//gerat