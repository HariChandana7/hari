// Prime Numbers between given range :
import java.util.Scanner;
public class PrimeNumbers 
{
    public static void main(String... args) 
     {
        Scanner sc = new Scanner(System.in);
         int min = sc.nextInt();
           int max =sc.nextInt();
         while (min < max) {
             boolean flag = false;

            for(int i = 2; i <= min/2; ++i) {            
            if(min % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag && min != 0 && min != 1){
            System.out.print(min + " ");

        ++min;
       }             
      sc.close();   
    }
  }
/* Output :
 5
50
5 7 11 13 17 19 23 29 31 37 41 43 47
*/