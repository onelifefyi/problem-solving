// problem: https://practice.geeksforgeeks.org/problems/reverse-digit/0
import java.util.Scanner;
public class ReverseDigits{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int num = sObj.nextInt();
        int result = 0;
        while(num != 0){
            result *= 10;
            result += num%10;
            num /= 10;
        }
        System.out.println(result);
    }
}