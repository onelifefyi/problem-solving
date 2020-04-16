//problem: https://codeforces.com/problemset/problem/281/A

import java.util.Scanner;
public class WordCap{
    public static void main(String[] args){ 
        Scanner sObj = new Scanner(System.in);
        String input = sObj.nextLine();
        if((int)input.charAt(0) < 91){
            System.out.println(input);
        }
        else{
            System.out.println((char)((int) input.charAt(0) - 32) + input.substring(1,input.length()));
        }
    }
}