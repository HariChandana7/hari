import java.util.*;
public class  StrLenExample
{
   static void sort(String []s, int n)
   {
           for (int i=1 ;i<n; i++)
          {
	String temp = s[i];
	int j = i - 1;
	while (j >= 0 && temp.length() < s[j].length())
	{
	   s[j+1] = s[j];
	      j--;
                   }
             s[j+1] = temp;
     }
}
    static void printArraystring(String str[], int n)
    {
         for (int i=0; i<n; i++)
	System.out.print(str[i]+" ");
      }
	public static void main(String args[])
	{
	     Scanner sc =new Scanner(System.in);
	     int n = sc.nextInt();
	   String array[] = new String[n+1] ;
	    for(int k =0 ;k<n+1 ;k++){
		 array[k] = sc. nextLine();
	        }	    
     	    sort(array,n+1);
   	    printArraystring(array, n+1);
     
	}
}
/*  Sample Input 1 :
4
Together
We
are
BulletProof

Sample Output 1:

 We  are Together  BulletProof

Sample input 2:

5
She
is
waiting
for
them

Sample Output 2:

 is  She  for  them waiting
*/