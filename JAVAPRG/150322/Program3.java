import java.util.*;
class Program3 {
         public static void main(String... args)  {
                 Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	 int[] array = new int[size];
	for(int i=0 ; i<size;i++) { array[i] =sc.nextInt(); }
           System.out.println(Arrays.toString(array));
	Large_Small(array);
        }
	public static void Large_Small(int arr[])  {
	  int max=arr[0];
	  int min = arr[0] ;
	    for(int i =0 ;i< arr.length;i++)  {
	           if(arr[i]<min) { min = arr[i] ; }
	             if(arr[i]>max) { max = arr[i] ; }
	   }
	       System.out.println("Largest number in array : " +max);
	        System.out.println("Smallest number in array : " +min);
	}
   }
/* Sample Input :
5
1
2
-4
5
9
Sample Output :

[1, 2, -4, 5, 9]
Largest number in array : 9
Smallest number in array : -4
*/