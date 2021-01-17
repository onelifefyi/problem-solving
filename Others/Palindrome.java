// check if the string is palindrome or not
import java.util.Scanner;
public class Palindrome{

    public static boolean isPalindrome(String input){
        int left = 0;
        int right = input.length()-1;
        while(left <= right) if(input.charAt(left++) != input.charAt(right--)) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String input = sObj.next().toLowerCase();
        System.out.println(isPalindrome(input));
    }
}