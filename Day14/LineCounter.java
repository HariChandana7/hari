// Line count using RegularExpression.......

public class LineCounter 
{

	public static int getLineCount(String text)
	{
		
		return text.split( "[\n|\r]" ).length;
	}
	
	public static void main(String... args)
	{
		String mytext = " line \n input\nCount Number of lines \n Goodluck " ;
		System.out.println( mytext );
		int count = getLineCount(mytext);
		System.out.println("Number of Lines = " +count);
	}
}

/* Output :
 line
 input
Count Number of lines
 Goodluck
Number of Lines = 4 
*/