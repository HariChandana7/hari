//Pushing the Uppercase characters to end of the String...

import java.util.Scanner ;
public class StringArrangement
{
 
    static public String move(String str)
    {
        int len = str.length();
        String low = "" ;
        String upper = "" ;
        char ch;
        for (int i = 0; i < len; i++) 
        {
            ch = str.charAt(i);
             if (ch >= 'A' && ch <= 'Z')
           {
                upper += ch;
            }
            else {
                low += ch;
            }
        }
        return  low + upper ;
    }
 
    public static void main(String...  args)
    {
        Scanner sc = new Scanner(System.in) ;
          String str = sc.nextLine();
        System.out.println("Before arranging :   " + str);
        System.out.println("After  arranging :   " + move(str));
        sc.close() ;
    }
}
/*  Sample Input :
" the world's biggest boy band is BangTan Sonyeondan "

Sample Output :

Before arranging :   " the world's biggest boy band is BangTan Sonyeondan "
After  arranging :   " the world's biggest boy band is angan onyeondan "BTS
