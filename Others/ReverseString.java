//problem: Reverse a given string

import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        // Method 1 using arrays
        char[] cStr = sObj.nextLine().toCharArray();
        for(int i=cStr.length-1; i>=0; i--){
            System.out.print(cStr[i]);
        }

        // Method 2 using String
        // String s = sObj.nextLine();
        // for(int i=s.length()-1; i>=0; i--){
        //     System.out.print(s.charAt(i));
        // }
    }
}