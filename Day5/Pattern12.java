public class Pattern12
{
      public static void main(String[] args)   
      {  
       int rows=7;    
       int chvalue =65;      
       for (int i=0; i <= rows; i++)   
     {  
          for (int j = 0; j <= i; j++)   
           {   
           System.out.print((char)(chvalue +j)+" ");   
            }               
          System.out.println();   
      }   
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
/* Output :
A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E F G
A B C D E F G H
A B C D E F G
A B C D E F
A B C D E
A B C D
A B C
A B
A
*/  