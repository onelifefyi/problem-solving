// problem: https://codeforces.com/contest/1409/problem/A
// Accepted
import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int a = sObj.nextInt();
            int b = sObj.nextInt();
            int abs = Math.abs(a-b);
            if(abs%10 == 0) System.out.println(abs/10);
            else System.out.println((abs/10) + 1);
        }
    }
}