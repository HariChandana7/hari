// Full Pyramid number pattern...

import java.util.Scanner;
public class Pattern6
{
     public static void printPattern(int n)
	{
	 int num=0;
	  for(int i=1; i<=n; i++)
	      {
	           for(int k=i; k<n; k++)
	                      System.out.print("  "); 
		   for(int j=1; j<=i; j++)
		       {
			num++;
			System.out.print(num +" ");
			}
			for(int t=1; t<i; t++)
			{
				num--;
				System.out.print(num +" ");
			}
			System.out.println();
		}
	}


	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
	
		printPattern(n);
	}
}

/* Output :
5
            1
        2 3 2
     3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
*/