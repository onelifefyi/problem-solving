//problem: https://codeforces.com/problemset/problem/1136/B

import java.util.Scanner;
import java.lang.Math;

public class NatsyaGame{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int pos = sObj.nextInt();
        int moves = n-1 + Math.min(n-pos,pos-1);    // to travel
        int energy = n*2 + 1;                       // to throw block and get coin
        System.out.println(moves + energy);
    }
}