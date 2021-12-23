//String methods : isEmpty() ,equals(),equalIgnoreCase(), toLowerCase() ,toUpperCase() .
import java.util.Scanner; 
public class Example3
{
  public static void main(String... args)
   {
     Scanner sc = new Scanner(System.in);
      String s1= sc.nextLine();
      String s2 = sc.nextLine();
       String s3 = "";       
        System.out.println("Strings are equal : " +s1.equals(s2));
        System.out.println( "String  is empty : " +s3.isEmpty());
         System.out.println("String is empty : " +s1.isEmpty());
          System.out.println("Strings are equal :" + s1.equalsIgnoreCase(s2));
           System.out.println(s1.toLowerCase());
          System.out.println(s1.toUpperCase());
       }
 }

/*Output :
piedPiper
PiedPiper
Strings are equal : false
String  is empty : true
String is empty : false
Strings are equal :true
piedpiper
PIEDPIPER

*/

     