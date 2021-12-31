//Exception Handling...   StringIndexOutOfBound Exception

import java.util.*; 
 public class Example5
 {
	public static void main(String[] args)
	{
  	    Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
 	    try
  	   {
  		 char c = str.charAt(str.length());
  		 System.out.println(c);
  	   }
  	   catch(Exception e)
  	   {
   		System.out.println("**Exception is Caught : "+e.toString());
  	    }
 	}
}
/* Sample Input : 
Everyone

Output :
**Exception is Caught : java.lang.StringIndexOutOfBoundsException: String index out of range: 8
*/