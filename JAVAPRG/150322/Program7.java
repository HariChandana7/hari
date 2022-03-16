import java.util.*;

class Program7 {
	
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	Object[] array= new Object[size];
	for(int i=0; i<size ; i++) { array[i] = sc.nextInt(); }
	   System.out.println("Original Array :  "+Arrays.toString(array));
 	 conversion(array);
 	  System.out.println("Modified Array : "+Arrays.toString(array));
	sc.close();
}

public static void conversion(Object[] array) {
    int i = 0;
    for (Object ob : array) {
        int n = (int)ob;
        boolean t3 = n % 3 == 0;
        boolean t5 = n % 5 == 0;

        array[i] = t3 && t5 ? "FizzBuzz" : t3 ? "Fizz" : t5 ? "Buzz" : n ;
        i++;
    }
}
}
/* Sample Input :
10
1
5
7
-15
19
21
28
-36
40
45   
   Sample Output :   

Original Array :  [1, 5, 7, -15, 19, 21, 28, -36, 40, 45]
Modified Array : [1, Buzz, 7, FizzBuzz, 19, Fizz, 28, Fizz, Buzz, FizzBuzz]

*/
