class AlphaCategorization {
 
    static void print(String str1) {
        char str[] = str1.toCharArray();
        System.out.print(str[0]);
        for (int i = 1; i < str.length; i++) {
            if ( (str[i] == str[i - 1] + 1) || (str[i] == str[i - 1] - 1) ) {
                System.out.print(str[i]);
            } else {
                System.out.print("\n" + str[i]);
            }
        }
    }
    public static void main(String[] args) {
        String str = "ABCFRsTUVzyx";
        print(str);
    }
}
 /* Sample Input :      

ABCFRsTUVzyx

Sample Output :

ABC
F
R
s
TUV
zyx
*/