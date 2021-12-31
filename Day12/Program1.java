
import java.util.Scanner;
import java.math.*;
 public class Program1
 {
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	  String[]  tokens = str.split("[!,?._'@ ]");
	   sc.close();
	  System.out.println(str.length());
	     if( str.length() >=1 || str.length() <= 4*Math.pow(10,5) ) {
	    for(int i =0 ; i <=str.length()-1 ; i++)
	    {
		System.out.println(tokens[i]);
                        }
	     }
	}
  }
/* 
 Sample Input :
This is World's Biggest boy_band@BTS

Output :

36
This
is
World
s
Biggest
boy
band
BTS
*/