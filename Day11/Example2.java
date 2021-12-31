//Exception handling.......

 public class Example2
 {
	 public static void main(String args[])
	 {
	          String str=null;
	     try
	    {
	 	  System.out.println(str.length());
	    }
	    catch(NullPointerException  ne)
	    {
	  	 System.out.println("Operations can't be carried on Null value ");
	     }
	   finally {
		System.out.println(" \n This is Finally block ");
	      }
	 }
   } 

/*
Output :
Operations can't be carried on Null value

 This is Finally block
*/
