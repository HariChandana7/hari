import java.util.*;
class Program9 {
  public static void main(String args[])  {
	Scanner sc = new Scanner(System.in);
	 int size1 = sc.nextInt();
	  int[]  arr1 = new int[size1];
	  int size2 = sc.nextInt();
	   int[]  arr2 = new int[size2];
           for(int i=0; i<size1 ; i++) {
	arr1[i] = sc.nextInt();  }
           for(int j=0 ; j<size2 ; j++) {
	 arr2[j] = sc.nextInt();  }
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	commonElements(arr1 , arr2);
       }
	public static void commonElements(int arr1[] , int arr2[]) {
	   for(int i =0 ; i<arr1.length;i++) {
	         for(int j=0; j<arr2.length;j++) {
		if(arr1[i] == arr2[j]) {  System.out.println( arr1[i]+ " " );  }
	           }
	     }
	}
  }
/* Sample Input :
4
5
1
4
8
12
2
4
6
8
10

Sample Output :
[1, 4, 8, 12]
[2, 4, 6, 8, 10]
4  
8 
*/