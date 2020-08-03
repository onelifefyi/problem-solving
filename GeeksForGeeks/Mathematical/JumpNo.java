// Problem: https://practice.geeksforgeeks.org/problems/jumping-numbers/0
import java.util.Scanner;
public class JumpNo{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        char[] arr = sObj.nextLine().toCharArray();
        boolean flag = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]+1 == arr[i] || arr[i-1]-1 == arr[i]) continue;
            flag = false;
            break;
        }
        if(flag) System.out.println("It's Jumping Number");
        else System.out.println("It isn't Jumping Number");
    }
}