import java.io.*;
import java.util.regex.*;

public class RegExpExample
   {
	public static void main(String... args)
	{
	  //final String REGEX_PATTERN ="coo.*per";
	  Pattern  p = Pattern.compile("coo.*per");
	 try  {
	            BufferedReader  br = new BufferedReader(new FileReader("C:\\Users\\91991\\Desktop"));
		String line ;
		while((line = br.readLine()) != null)  {
		       Matcher  m = p.matcher(line);
		        if(m.find())
			System.out.println("Matched Lines are : \n" +line);
		  }
	 }
	 catch(IOException  e)  {
	       e.printStackTrace();
	 }
                 }
  }