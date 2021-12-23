//String methods : valueOf() .
 public class Example5
{
  public static void main(String... args)
   {
    int num = 77;
    boolean  t = true , f = false ;
    String s1=String.valueOf(num);
    String s2 =String.valueOf(t);
     String s3 =String.valueOf(f);
     System.out.println(s1+77);
     System.out.println(s2 + "      " +s3);
      System.out.println(s2.concat(s3));
    }
  }

/*  Output :
7777
true      false
truefalse
*/