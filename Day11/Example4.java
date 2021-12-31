//Exception Handling.....     ArrayIndexOutOfBound Exception..

import java.util.Scanner;
  class Example4
  {
	public static void main(String[] args)
	 {
	  Scanner sc=new Scanner(System.in);
	  int array[]=new int[]{13,07,20,1,3};
	  int n=sc.nextInt();
 	  try
 	  {
		int index=array[n];
		System.out.println(index);  
	  }  
	  catch(Exception e)
	  {
		System.out.println(e);
 	  }
	  finally
	  {
		System.out.println("This is Finally Block");
	  }
 	}
  }
/*  Sample Input :   3
 Sample Output :
6
This is Finally Block
_______________
Sample Input :
 6
Output :

java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
This is Finally Block        
*/