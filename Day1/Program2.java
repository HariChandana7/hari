import java.util.Scanner;
class Program2
{
 public static void main(String args[])
 {
   int n ;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
  if(n%2==0) // determines whether n is even or odd 
  { 
    if(n>=2 && n<=5)
     { 
       System.out.println("Not Weird");
     }
    else if(n>=6 && n<=20)
     {
       System.out.println("Weird");
     }
      else{
            System.out.println("Not Weird");
       }
  }
  else
  {
   System.out.println("Weird");
  }  
 }
}
 //Output :
 //8
 //Weird
//29
//Weird
//4
//Not weird
//34
//Not Weird
