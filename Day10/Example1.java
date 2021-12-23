// String methods : charAt(int index) , length() ,subString(int Startindex ,int Endindex) , contains(CharSequence)-->returns True or False .

import java.util.Scanner;
public class Example1
{
  public static void main(String... args)
   {
      Scanner sc = new Scanner(System.in);
          String str = sc.nextLine();
           int  index = sc.nextInt();
           int n=str.length();
          System.out.println(str.charAt(index));
           System.out.println("Starting character is:  "+ str.charAt(0) + " and   Ending character is : " + str.charAt(n-1));
           System.out.println(str.substring(index-3 , n));
         System.out.println(str.contains("ANA"));
          System.out.println(str.contains("Gang"));
    }
 }  

//Output :
//HARICHANDANA
//7
//N
//Starting character is:  H and   Ending character is : A
//CHANDANA
//true
//false