import java.util.*;
public class DemoHashset2 {
    public static void main(String... args) {
           String str = "Bangtan";
            HashMap<Character , Integer> hmp = new HashMap<Character , Integer >();
           char ch[] = str.toCharArray();
            for(char current : ch){
                if(hmp.containsKey(current)){
                    hmp.put(current ,hmp.get(current)+1);
                } else{
                    hmp.put(current ,1);
                }
            }
            System.out.println(hmp);
    }
    
}
/*  Output :

{a=2, B=1, t=1, g=1, n=2}

*/