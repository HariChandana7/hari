// Program to find pairs of elements whose sum is equal to Specified number...

import java.util.Scanner;
import java.util.Arrays;

class Program6
{
     public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int arraySize = sc.nextInt();
	int[]  array = new int[arraySize];
	
	for(int i=0 ;i<arraySize ; i++) {
		array[i] = sc.nextInt();
	}
	int num = sc.nextInt();
	System.out.println("Array is : " +Arrays.toString(array));
	System.out.println("Pairs of elements whose sum is equal to "+num +" :");
	
	for(int j=0 ;j<array.length ; j++) {
	   for(int k=j;k<array.length;k++) {
	         if((array[j]+array[k] == num) &&  j != k) {
		System.out.println("( "+array[j]+"," + array[k]+" )");
	            }
	  }
	sc.close();
	}
	}
}
/*  Sample Input :
7
14
-4
8
3
2
9
5
10

Sample Output :

Array is : [14, -4, 8, 3, 2, 9, 5]
Pairs of elements whose sum is equal to 10 :
( 14,-4 )
( 8,2 )
*/