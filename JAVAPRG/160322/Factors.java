import java.util.*;
public class Factors {

     public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	  int  num = sc.nextInt();
	  printFactors( num );
       }
	public static void  printFactors(int n )  {
	 if(n < 0){
	    System.out.println("Enter Only Positive Integers ");   }
	else  {
	System.out.println("Factors of " +n +"  are : ");     
	  for( int i =1 ; i<= Math.sqrt(n) ; i++)  {
	         if(n%i == 0) {  
		        System.out.print(i +"  ");
		
		}
	    }  
	  }	
	}
}
/* Sample Input :
-30
Sample Output :

Enter Only Positive Integers
Sample Input :
64
Sample Output :

Factors of 64  are :
1  2  4  8