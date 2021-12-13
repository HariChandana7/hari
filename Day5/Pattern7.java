import java.util.*;  
public class Pattern7 
{  
     public static void main(String[] args)  
    {  
     int i, j, rows;  
       Scanner sc = new Scanner(System.in);  
       rows = sc.nextInt();  
         for (i = 0; i<=rows; i++)  
          {  
             for (j = 1; j <=i; j++)  
              {  
                  System.out.print(j+" ");  
               }  
           System.out.println( );
         }
       }
}

//Output :
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5