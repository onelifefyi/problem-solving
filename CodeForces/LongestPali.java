// memo table: karpooprak
// (first == last)  && isPali(first+1, last-1)

import java.util.Scanner;
public class LongestPali{

    public static int longestPali(String str){
        boolean memo[][] = new boolean[str.length()][str.length()];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<str.length(); i++){
            memo[i][i] = True;
        }
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String str = sObj.next().toLowerCase();
        int len = longestPali(str);
    }
}



/* i = 1
     dearmadamd
     0123456789
    0T
    1 T
    2  T  F
    3
    4
    5
    6
    7
    8
    9

*/