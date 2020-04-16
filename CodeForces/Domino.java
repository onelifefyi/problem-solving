//problem: https://codeforces.com/problemset/problem/50/A
import java.util.Scanner;

public class Domino{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int m = sObj.nextInt();
        int n = sObj.nextInt();

        if(m%2!=0 && n%2!=0){
            System.out.println((m/2)*n + n/2);
        }
        else{
            System.out.println(n*m/2);
        }
    }
}
