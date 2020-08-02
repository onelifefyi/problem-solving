// problem: https://practice.geeksforgeeks.org/problems/binary-number-to-decimal-number/0
import java.util.Scanner;
import java.lang.Math;
public class BinToDec{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        char[] input = sObj.nextLine().toCharArray();
        int total = 0;
        int max = input.length - 1;
        for(char ch: input){
            if(ch == '1') total += Math.pow(2,max);
            max--;
        }
        System.out.println(total);
    }
}