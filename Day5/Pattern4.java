public class Pattern4
{    
    public static void main(String... args)   
    {     
    int i, j, n = 5;        
     for (i=0; i<n; i++)   
    {    
           for (j=1*(n-i); j>=0; j--)         
        {      
          System.out.print(" ");   
        }   
              for (j=0; j<=i; j++ )   
             {        
                  System.out.print(" *");   
                }      
      System.out.println();
      }          
    }
}

//Output :
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
  
  

