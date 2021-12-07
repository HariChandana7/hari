// **Anagrams :

import java.io.*;
import java.util.*;

 public class Program3
{
      public static void main(String... args)
      {
         Scanner sc=new Scanner(System.in);
          String str1=sc.nextLine();
           String str2=sc.nextLine();
          if(checkAnagram(str1,str2))
           {
               System.out.println(str1+" and "+ str2 +"  are Anagrams");
            }
            else{
                System.out.println(str1+" and "+str2+" are NOT Anagrams");
               }
           sc.close();
         }
              public static boolean checkAnagram(String str1,String str2)
               {
                  str1=str1.replaceAll("s","");
                   str2=str2.replaceAll("s","");
                    
                       if(str1.length() != str2.length())
                           {
                              return false;
                           } 
                      else{
                            char[]array1=str1.toLowerCase().toCharArray();
                             char[]array2=str2.toLowerCase().toCharArray();
                              
                                    Arrays.sort(array1);
                                    Arrays.sort(array2);
                               return(Arrays.equals(array1,array2));
                              }
                      }
       }
                          
//Output 1 :
//RACE
//care
//RACE and care  are Anagrams
 
//Output 2:
//Summer
//Supper
//Summer and Supper are NOT Anagrams
