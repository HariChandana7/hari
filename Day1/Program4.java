import java.util.*;
class Program4
{
     public static void main(String... args )
     {
       String S1 = "Java" ,S2="Python" ,S3="JavaScript" ;
       int values[]={7,777,77};
       System.out.printf("%-15s%03d\n",S1,values[0]); 
       System.out.printf("%-15s%03d\n",S2,values[1]);   
       System.out.printf("%-15s%03d\n",S3,values[2]); 
    }
}

 /* Output :
Java           007
Python         777
JavaScript     077  */

