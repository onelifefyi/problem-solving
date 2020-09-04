// problem: https://codeforces.com/contest/1409/problem/B
// Accepted
import java.util.Scanner;
public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            long a = sObj.nextLong();
            long b = sObj.nextLong();
            long x = sObj.nextLong();
            long y = sObj.nextLong();
            long n = sObj.nextLong();

            long prod1 = 0;
            long prod2 = 0;

            if(a-n < x){
                if((b-(n-(a-x))) < y) prod1 = x*y;
                else prod1 = x*(b-(n-(a-x)));
            } else prod1 = (a-n) * b;

            if(b-n < y){
                if((a-(n-(b-y))) < x) prod2 = x*y;
                else prod2 = y*(a-(n-(b-y)));
            } else prod2 = (b-n) * a;

            System.out.println(Math.min(prod1, prod2));
        }
    }
}