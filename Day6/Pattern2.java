
//Inverted Half Pyramid....

public class Pattern2  
      {  
        public static void main(String[] args)   
          {  
               int rows=5;  
              for (int i = rows; i >=0; i--)   
               {   
                  for (int j = 1; j <= i; j++)  
                   {  
                             System.out.print(j +" ");  
                    }  
                System.out.println();  
                }  
            }
   }  

//Output :
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
