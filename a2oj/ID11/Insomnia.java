// problem #16: https://codeforces.com/problemset/problem/148/A 

import java.util.Arrays;
import java.util.Scanner;

public class Insomnia{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int k = sObj.nextInt();
        int l = sObj.nextInt();
        int m = sObj.nextInt();
        int n = sObj.nextInt();
        int d = sObj.nextInt();
        boolean[] hit = new boolean[d+1];
        hit[0] = true;
        Arrays.fill(hit, true);
        for(int a=k; a<=d; a+=k) hit[a]=false;
        for(int b=l; b<=d; b+=l) hit[b]=false;
        for(int c=m; c<=d; c+=m) hit[c]=false;
        for(int dd=n; dd<=d; dd+=n) hit[dd]=false;

        int count = 0;
        for(boolean b: hit) if(!b) count++;
        System.out.println(count);
    }
}