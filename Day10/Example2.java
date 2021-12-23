//String methods : String format() 

public class Example2
 {  
    public static void main(String[] args)
      {          
        String str =String.format("%34.10f",34.223);
        String s1 = String.format("%d", 777);  
        String s2= String.format("|%10d|", 777);   
        String s3 = String.format("|%-10d|", 777); 
        String s4 = String.format("|% d|", 777);   
        String s5 = String.format("|%010d|", 777); 
        System.out.println(s1);  
        System.out.println(s2);  
        System.out.println(s3);  
        System.out.println(s4);  
        System.out.println(s5); 
        System.out.println(str);   
      }  
}  

//Output :
/*

777
|       777|
|777       |
| 777|
|0000000777|
                     34.2230000000
*/