// problem #7: https://codeforces.com/problemset/problem/59/A
import java.util.Scanner;
public class Word{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int lowerCnt = 0;
        int upperCnt = 0;
        String input = sObj.nextLine();
        for(char ch: input.toCharArray())
            if(ch >= 'a') lowerCnt++;
        upperCnt = input.length() - lowerCnt;
        //System.out.println("lower count: " + lowerCnt);
        if(lowerCnt >= upperCnt) System.out.println(input.toLowerCase());
        else System.out.println(input.toUpperCase());
    }
}