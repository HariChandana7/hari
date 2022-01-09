import java.util.*;
public class DemoLinkedHashset
{
   public static void main(String... args) 
   {
	String str = "Bangtan";
                  LinkedHashMap<Character , Integer> hmp = new LinkedHashMap<Character , Integer >();
                   char ch[] = str.toCharArray();
                  for(char current : ch){
                           if(hmp.containsKey(current)){
                             hmp.put(current ,hmp.get(current)+1);
                } else

                {
                    hmp.put(current ,1);
                }
    }
/* Output :

{B=1, a=2, n=2, g=1, t=1}

*/

            System.out.println(hmp);
    }
    
}