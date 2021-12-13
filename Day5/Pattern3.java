class Pattern3
{
  public static void main(String... args)
   {
      int n=5;
       char ch ='E';
      for(int i=0 ;i<n ;i++)
       { 
           for(int j=0 ;j<=i ; j++)
               {
                                      System.out.print(ch + " ");
                      ch++;
                }
                    
                   System.out.println();
            }
     }
 }
 
//Output :
//E
//F G
//H I J
//K L M N
//O P Q R S

