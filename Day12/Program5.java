import java.util.*;
public class matrix
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
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
  for(i=0;i<n;i++)
  {
   for(j=0;j<n;j++)
   { 
    System.out.print(matrix[i][j]+" ");
   }
   System.out.println();
  }
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
 System.out.println(diff);
 sc.close();
 }
}

