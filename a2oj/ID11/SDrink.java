// problem #25: https://codeforces.com/problemset/problem/151/A
import java.util.Scanner;
public class SDrink {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n, k, l, c, d, p, nl, np;
        n= sObj.nextInt();
        k= sObj.nextInt();
        l= sObj.nextInt();
        c= sObj.nextInt();
        d= sObj.nextInt();
        p= sObj.nextInt();
        nl= sObj.nextInt();
        np= sObj.nextInt();
        System.out.println(Math.min(Math.min(k*l/nl,c*d), p/np)/n);
        sObj.close();
    }
}
