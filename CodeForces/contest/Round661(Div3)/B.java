// https://codeforces.com/problemset/problem/1399/B

import java.lang.Math;
import java.util.Scanner;
public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        for(int i=0; i<n; i++){
            int noGifts = sObj.nextInt();
            int cndy[] = new int[noGifts];
            int orng[] = new int[noGifts];
            int minC = Integer.MAX_VALUE;
            int minO = Integer.MAX_VALUE;
            for(int x=0; x<noGifts; x++){
                cndy[x] = sObj.nextInt();
                if(cndy[x] < minC) minC = cndy[x];
            }
            for(int y=0; y<noGifts; y++){
                orng[y] = sObj.nextInt();
                if(orng[y] < minO) minO = orng[y];
            }
            long count = 0;
            for(int z=0; z<noGifts; z++){
                if(cndy[z] > minC || orng[z] > minO){
                    count += Math.max(cndy[z]-minC,orng[z]-minO);
                }
            }
            System.out.println(count);
        }
    }
}

