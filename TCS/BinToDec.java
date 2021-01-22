// Convert given binary number to decimal

import java.util.Scanner;
public class BinToDec{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String input = sObj.next();
        int inputArr[] = new int[input.length()];
        
        int index = 0;
        for(char ch: input.toCharArray()) inputArr[index++] = ch - '0';

        int place = 0;
        int total = 0;
        for(int i=inputArr.length-1; i>=0; i--) total += inputArr[i]*Math.pow(2, place++);

        System.out.println(input + " in decimal is " + total);
    }
}