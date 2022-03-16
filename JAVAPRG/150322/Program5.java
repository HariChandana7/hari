import java.util.Scanner;

class Program5  {
     public static void main(String... args)  {
	Scanner sc =new Scanner(System.in);
	 int size = sc.nextInt();
	   int[] array = new int[size];
	 for(int i=0;i<size ;i++){ array[i] =sc.nextInt(); }
	sc.close();
	int sum = 0;
	int product = 1;
	for(int i=0;i<size;i++) {
		sum = sum + array[i];
		product = product * array[i] ; }
	if(sum % 2 ==0){ System.out.println("Sum of elements is : " +sum);}
	else{ System.out.println("Product of elements is : " +product);}
	}
   }
/* Sample Input :													
5
1
3
5
8
2
Sample Output :
Product of elements is : 240

Sample Input2 :
6
3
9
-5
6
2
7
Sample Output2  :

Sum of elements is : 22
*/