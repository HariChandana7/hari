import java.util.*;
class Program4 {
      public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	 int size = sc.nextInt();
	  int[][]  mat = new int [size][size] ;
	   for(int i =0 ;i<size;i++) {
		for(int j= 0 ;j<size ;j++) {
			mat[i][j] = sc.nextInt();   }
	    }
	System.out.println("Given matrix is :");
	   for(int i =0 ;i<size;i++) {
		for(int j= 0 ;j<size ;j++) 
		System.out.print(mat[i][j] +"  ");
		    System.out.println();
	          }
	        sum(mat , size );
	  }
	   public static void  sum(int arr[][] , int n)  {
		int result = 0 ;
		for(int i =0 ;i<n;i++) {
		        for(int j= 0 ;j<n ;j++)   {
			if(i<j ) {   result += arr[i][j] ;  }
		       }
		}
	        System.out.println("Sum  : "+ result );
	   }
    }
/* Sample Input :
3
2
3
4
5
6
7
4
6
8

Sample Output : 

Given matrix is :
2  3  4
5  6  7
4  6  8
Sum  : 14	  */