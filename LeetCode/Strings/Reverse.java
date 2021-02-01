// Reverse a character array

import java.util.Scanner;
import java.util.Arrays;
public class Reverse{

    public static void reverseString(char[] s) {
        char temp = ' ';
        for(int i=0; i<s.length/2; i++){
            temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(s));
    }


    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String input = sObj.next();
        reverseString(input.toCharArray());
    }
}