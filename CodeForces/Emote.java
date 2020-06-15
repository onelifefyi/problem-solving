//problem: https://codeforces.com/problemset/problem/1117/B

import java.util.Scanner;
public class Emote{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        long n = sObj.nextLong();
        long max = sObj.nextLong();
        long rowMax = sObj.nextLong();
        long max1 = 0;
        long max2 = 0;
        for(int i=0; i<n; i++){
            long no = sObj.nextLong();
            if(no > max1){
                max2 = max1;
                max1 = no;
            }
            else if(no > max2){
                max2 = no;
            }
        }
        if(rowMax >= max){
            System.out.println(max * max1);
            return;
        }
        System.out.println((max / (rowMax+1))*(rowMax*max1 + max2) + (max % (rowMax+1))* max1);
    }
}