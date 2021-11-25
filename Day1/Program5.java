import java.util.Scanner;
class Program5
{ 
 public static void main(String... args)
 {
   int n , i ;
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number ");
    n=sc.nextInt();
    
   for(i=1 ; i<=10 ;i++)
   {
    System.out.printf("\n%d  x  %d  = % d ", n ,i ,(n*i));
   }
  }
}
  
//Output :
//  Enter a number
//  7

 //7  x  1  =  7
 //7  x  2  =  14
 //7  x  3  =  21
// 7  x  4  =  28
// 7  x  5  =  35
// 7  x  6  =  42
// 7  x  7  =  49
// 7  x  8  =  56
// 7  x  9  =  63
 //7  x  10  =  70