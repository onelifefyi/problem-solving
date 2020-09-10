// problem #17: https://codeforces.com/problemset/problem/248/A

import java.util.Scanner;

public class Cupboards{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int lOpen = 0;
        int rOpen = 0;
        for(int i=0; i<n; i++){
            int tempLeft = sObj.nextInt();
            int tempRight = sObj.nextInt();
            if(tempLeft == 1) lOpen++;
            if(tempRight == 1) rOpen++;
        }
        int total = 0;
        // if(lOpen > rOpen) total += n-lOpen+rOpen;
        // else total += n-rOpen+lOpen;
        total += Math.min(lOpen, n-lOpen) + Math.min(rOpen, n-rOpen);
        System.out.println(total);
        sObj.close();
    }
}