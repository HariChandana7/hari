  // Program to print Fibonacci series of numbers....
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String... args) {
        int a1=0,a2=1;
    Scanner sc =new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println("Fibonacci series upto " + n +" terms : ");
     for (int i = 1; i <= n; ++i) {
       System.out.print(  a1 + "  ");
       int ai  = a1+ a2;
       a1 = a2;
       a2 = ai;
     }
     sc.close();
    }
}
/* Output :
10  --------> user input
Fibonacci series upto 10 terms :
0  1  1  2  3  5  8  13  21  34
*/

