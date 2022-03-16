

public interface  GrowingDemo {
	public static void isGrowing() {
	 }
  }
public class GrowingNumber implements GrowingDemo {
	static boolean flag = false ;
	public static void isGrowing(int num ) 
	{
	int currentDigit = num %10 ;
	num = num/10 ;
	while(num > 0 ) {
	 	if(currentDigit <= num % 10 ) {
		     flag = true ;
		     break;
		}
		currentDigit = num % 10 ;
		num = num/10 ;
	}
	if(flag) 
		System.out.println("Not Growing Number ");
	else 
		System.out.println("Growing Number ");
  }
  }

public class GrowingString implements GrowingDemo {
	public static String isGrowing(String s ) {
	 int n = s.length() ;
	 char ch[] = new char [n];
	 for( int i=0 ;i<n ;i++)
	 {
		ch[i] = s.charAt(i) ;
	  }
	    Arrays.sort(ch) ;
	 for( int i=0 ; i<n ;i++ )
		if(ch[i]!= s.charAt(i) )
			return "Not a Growing String "
	return "Growing String "
	}
  }
 public class GrowingDemo {
 	public static void main(String... args) {
	    Scanner sc = new Scanner(System.in) ;
	      int number = sc.nextInt();
	      String  word = sc.next();
	          isGrowing(number) ;
	          isGrowing(word) ;
                }
  }
			
	