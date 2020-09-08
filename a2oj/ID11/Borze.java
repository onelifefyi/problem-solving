//problem #4: https://codeforces.com/problemset/problem/32/B
import java.util.Scanner;
public class Borze{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        StringBuilder sOut = new StringBuilder();
        char[] input = sObj.nextLine().toCharArray();
        int i=0;
        while(i<input.length){
            if(input[i]=='.'){
                sOut.append('0');
                i++;
            }
            else{
                if(input[i+1]=='.') sOut.append('1');
                else sOut.append('2');
                i+=2;
            }
        }
        System.out.println(sOut);
    }
}