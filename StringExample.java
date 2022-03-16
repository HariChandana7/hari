// Separating 0's and 1's in given Binary String....

import java.util.Scanner;
public class StringExample
{
       public static void main(String... args)
    {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
          char array[] = str.toCharArray();
            System.out.println("Given String : " +str);
             
             separate0and1(array, str.length());
             System.out.println("New String : ");
	for(int i = 0 ; i <= str.length()-1; i++)
	{
		System.out.print( array[i]+" ");
                    }
        sc.close();
    }
     static  void  separate0and1( char array[], int n)
    {
        int left = 0, right = n-1;
    	while (left < right)
    	{
      	     while (array[left] == '0' && left < right)
          	          left++;
             	     while (array[right] == '1' && left < right)
               	           right--;
           	 if (left < right)
           	 {
                   	       array[left] = '0';
                           array[right] = '1';
                            left++;
                           right--;
                     }
  	 }       
        }
}
/* Output :
010101001  -------> user input....
Given String : 010101001
New String :
0 0 0 0 0 1 1 1 1