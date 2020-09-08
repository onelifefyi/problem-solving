// problem #8: https://codeforces.com/problemset/problem/281/A
import java.util.Scanner;
public class Capitalization{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String input = sObj.nextLine();
        System.out.println(input.substring(0,1).toUpperCase()+ input.substring(1));
    }
}