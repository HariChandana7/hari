//Matrix problems..

import java.util.*;
public class Program5
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	    System.out.println("Enter size of square matrix : ");
	  int n=sc.nextInt();
	  int sum1=0,sum2=0;
	  int i,j;
	  int matrix[][]=new int[n][n];
	  for(i=0;i<n;i++)
	  {
		for(j=0;j<n;j++)
		{ 
		  matrix[i][j]=sc.nextInt();
		   }
	  }
	  System.out.println();
  	for(i=0;i<n;i++)
	  {
		for(j=0;j<n;j++)
		{    
		System.out.print( matrix[i][j]+" ");
		}
  	     System.out.println();
  	}
	 System .out.println();
	  for(i=0;i<n;i++)
	  {
		for(j=0;j<n;j++)
   		{ 
   		   if(i==j)
		    sum1+=matrix[i][j];
	 	}
	  }
	  for(i=0;i<n;i++)
	  {
		for(j=0;j<n;j++)
		{ 
    		     if(i==n-j-1)
   		          sum2+=matrix[i][j];
 		  }
 	 }
 	int diff=Math.abs(sum1-sum2);
	 System.out.println("The difference is :  "+diff);
	sc.close();
           }
}
/* Sample Input :
4
1 2 3 4
2 4 6 8
9 12 15 18
4 8 12 16

Sample Output :
1 2 3 4
2 4 6 8
9 12 15 18
4 8 12 16

The difference is :  10
*/
