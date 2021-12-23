//string methods : concat(),  indexOf(), split(), replace() .

public class Example4
{
  public static void main(String... args)
   {
     String s1 = "Bangtan";
     String s2 ="Sonyeondan";
     String  str ="   This is world's Biggest Boy band ";
      String  str1[] = str.split(" ");
     System.out.println(s1);
      System.out.println(s2);
      System.out.println(s1.concat(s2));
      System.out.println(str1);
      System.out.println(s1.replace( 'B' ,  'D').concat(s2));
      System.out.println(str.trim());
      for(String w : str1) {
         System.out.println(w);
         }
    }
} 
/*  Output :
 Bangtan
Sonyeondan
BangtanSonyeondan
[Ljava.lang.String;@5acf9800
DangtanSonyeondan
This is world's Biggest Boy band



This
is
world's
Biggest
Boy
band
 
*/