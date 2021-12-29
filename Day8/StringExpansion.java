// Expanding String.....
 import java.util.Scanner ;
  public class StringExpansion
  {
	public static  String  printExpansion(char ch,int times) 
	{ 
	     String  presentString = "";
	        for(int i=0 ;i<times ;i++) {
		presentString += ch+"" ;
	         }
	 return presentString ;
	}
	 public static void main(String... args)
                      {
	   Scanner sc = new Scanner(System.in);
 	  String str = sc.nextLine();
                        sc.close();
	  char alphabets[] =new char[str.length()];
	  int digits[] =new int[str.length()];

 	  int a=0,b=0,totalDigits = 0;
	  for(int i=0 ; i<str.length() ; i++) {
		if(Character.isLetter(str.charAt(i))) 
		 {
		     alphabets[a] = str.charAt(i);
           		   a++ ;
	 	 }
		else if(Character.isDigit(str.charAt(i))) 
		{
		       digits[b] = str.charAt(i) - '0' ;
		        totalDigits++ ; 
		     if(i!=str.length()-1)
		     {
			if(Character.isDigit(str.charAt(i+1)))
                                                              {
			        digits[b] =(digits[b] * 10) +(str.charAt(i+1) - '0');             
			         i+=1;                                                
                                        	   }
                                                            b++;
		    }
	              } 
	     }
	 String finalResult = "";
                     for(int j=0 ; j<totalDigits ; j++)  {
	                 finalResult+= StringExpansion.printExpansion( alphabets[j] , digits[j] );
                     }
                 System.out.println(finalResult);
        }
  }

/* 
 Sample input :
	a2b3u5
Sample output :
	aabbbuuuuu
*/
  		