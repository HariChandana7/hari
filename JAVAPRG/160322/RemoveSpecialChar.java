import java.util.*;
public class RemoveSpecialChar  {  
	public static void main(String args[])   {  
	 Scanner  sc = new Scanner(System.in); 
	String str= sc.nextLine();  
	  System.out.println(" Original Sytring : " +str);
	str = str.replaceAll( "[^a-zA-Z0-9]" , " " );  
	System.out.println(str);  
	sc.close();
	}  
     }
/* Sample Input :
This $is @a J@ava Pr&ogram
 
Sample Output : 
Original Sytring : This $is @a J@ava Pr&ogram
This  is  a J ava Pr ogram      */