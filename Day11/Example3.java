//Exception Handling......

import java.io.*;
  public class Example3 
  {
	public static void main(String[] args) 
	{
	     File file = new File("Dynamite.txt");
	     FileInputStream fn = null;
	    try
	    {
	     	 fn = new FileInputStream(file);
	    	  while (fn.read()!=-1)
	    	  {
	    	    System.out.println(fn.read());
	     	 }
	    }
	    catch (FileNotFoundException e)
	    {
	  	   e.printStackTrace();
	    }
	    catch(IOException e)
	    {
	   	  e.printStackTrace();
	    }
	}
}
/*  Output :
java.io.FileNotFoundException: Dynamite.txt (The system cannot find the file specified)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        at Example3.main(Example3.java:12)
*/
