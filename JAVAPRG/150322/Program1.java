// Pattern similar to Arrangement of gifts in each row that are equal to row number..

import java.util.Scanner ;
class Program1 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
          int rows = sc.nextInt();
	for(int i=1;i<=rows;i++) {
	       for(int j=1 ; j<=i ;j++) {
		System.out.print("@ ");  }
	      System.out.println();  }
	sc.close();
	}
   }
/*  Sample Input :
5
Sample Output :
@
@ @
@ @ @
@ @ @ @
@ @ @ @ @
*/