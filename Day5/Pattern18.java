public class Pattern18
{    
    public static void main(String... args)   
    {     
    int i, j, n = 5; 
     char ch= 'A';       
     for (i=1; i<=n; i++)   
    {    
           for (j=n-i; j>=1; j--)         
        {      
          System.out.print(" ");   
        }   
              for (j=1; j<=i; j++ )   
             {        
                  System.out.print(" "+ch );   
                }     
       ch++; 
      System.out.println();
      }          
    }
}
/* Output :
       A
     B  B
   C  C  C
 D  D D  D
E  E  E  E  E
*/