// Exceptions and Exception Handling....
import java.util.Scanner;
  class Example1
  {
	public static void main(String... args)
                {
	Scanner sc = new Scanner(System.in);
	 int  ntr = sc.nextInt();
	 int  dtr =sc.nextInt();
 	       try  {
		 int result = ntr/dtr ;
		System.out.println(" The Result is : " + result );	              
	            }
	 
	       catch( ArithmeticException  ae )
	       {	
		System.out.println("Hello... Denominator should not be ZERO ");
	         }
	}
  }
     
/* 

Sample input 1 :			Sample input 2 : 
25				25
3				0

 Sample output 1:			Sample output 2 :
 The Result is : 8			Hello... Denominator should not be ZERO

 */



 

             	