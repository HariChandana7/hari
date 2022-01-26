//Replace the Space..

import java.util.Scanner;
import java.util.regex.*;

public class ReplaceSpace {
   public static void main(String... args) {
     
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      String regex = "\\s+";
            Pattern pattern = Pattern.compile(regex);
           Matcher matcher = pattern.matcher(input);
           String result = matcher.replaceAll(" ");
	System.out.println("Modified Line :  \n"+result);
   }
}
/* 
 Sample Input :

The given    line has  more   number of     Spaces
Sample Output :

Modified Line :
The given line has more number of Spaces
*/