import java.util.Scanner;
public class Pattern15
{
      public static void main(String[] args)   
      {  
       Scanner sc =new Scanner(System.in);
       int rows = sc.nextInt();    
       int chvalue = 65;            
     for (int i =0; i <=rows; i++)  
        {  
          for (int j =rows-1; j >= i; j--)  
         {  
          System.out.print((char)(chvalue+j) +" ");  
           }           
          System.out.println();
        }
    }
}

/*  Output :
5
E D C B A
E D C B
E D C
E D
E

*/