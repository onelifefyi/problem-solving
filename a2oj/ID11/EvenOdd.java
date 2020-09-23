//problem #37: https://codeforces.com/problemset/problem/318/A
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        long n = sObj.nextLong();
        long k = sObj.nextLong();
        if(k <= (n+1)/2) System.out.println((k*2)-1);
        else System.out.println((k-(n+1)/2)*2);
    }
}
