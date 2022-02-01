import java.util.Scanner ;
public class StringConcatenation 
{
	public static void main(String... args ) {
	 Scanner sc = new Scanner(System.in);
	  String str1 = sc.nextLine();
	  String str2 = sc.nextLine();
  	       String result =  str1 + str2 ;
	  System.out.println( "After Concatenation ::  " + result );
	}
}

/* Sample Input :
--------------------------------------
Global
Warming

Sample Output :
-----------------------------------------
After Concatenation ::  Global Warming
*/