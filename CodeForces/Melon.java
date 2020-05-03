//problem: https://codeforces.com/problemset/problem/4/A
import java.util.Scanner;
public class Melon{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        if(n % 2 == 0 && n > 2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}