class Pattern2
{
  public static void main(String... args)
   {
      int n=5, number =0;
      for(int i=0 ;i<n ;i++)
       { number++;
           for(int j=0 ;j<=i ; j++)
               {
                   System.out.print(number + " ");
                }
                    
                   System.out.println();
         }
    }
}
     

//Output  :
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5

