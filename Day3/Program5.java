

import  java.io.*;
import  java.util.*;
import  java.text.*;
import  java.math.*;
import  java.util.regex.*;

public class Program5
{
   public static void main(String... args)
    {
          Scanner sc = new Scanner(System.in);
             double payment = sc.nextDouble();
             sc.close();  

                NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);  
                NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
                NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en","in"));
           
                         String us = usFormat.format(payment);
                         String india = inFormat.format(payment);
                         String france = frFormat.format(payment);
                         String china = cnFormat.format(payment);

                   System.out.println("US : "+us);
                   System.out.println("INDIA : "+india);
                   System.out.println("China : "+china);
                  System.out.println("France : "+france);
       }
 }


//Output :
//17000.77
//US : $17,000.77
//INDIA : ?17,000.77
//China : ¥17,000.77
//France : 17?000,77 ?