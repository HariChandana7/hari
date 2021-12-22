import java.util.Scanner;
public class Pattern14
{
      public static void main(String[] args)   
      {  
       Scanner sc =new Scanner(System.in);
       int rows = sc.nextInt();    
       int chvalue =65;            
     for (int i = rows-1; i >=0; i--)  
        {  
          for (int j = 0; j <= i; j++)  
         {  
          System.out.print((char)(chvalue+j) +" ");  
           }           
          System.out.println();
        }
    }
}

/*   Output :
 5
A B C D E
A B C D
A B C
A B
A
 
*/