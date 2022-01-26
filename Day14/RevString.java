// Reversing a word...

import java.io.*;
import java.util.Scanner;
 
class   RevString {
    public static void main (String... args) {
         Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
        String  reversedStr = "" ;
        char ch;
       
      System.out.println("Original word :  "  + str);
 
      for (int i=0; i<str.length(); i++)
      {
        ch = str.charAt(i); 
        reversedStr= ch+reversedStr; 
      }
      System.out.println("Reversed word :  "+ reversedStr);
       sc.close();
    }
}
/* 
Sample Input :
   
Weverse

Sample Output :

Original word :  Weverse
Reversed word :  esreveW
*/
