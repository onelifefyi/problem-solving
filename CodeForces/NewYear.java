// https://codeforces.com/problemset/problem/750/A

// Bad code below:
// But works :(

/**
    take time to travel
    iterate for each problem (i++ * 5)
    subtract time to solve

 */

import java.util.Scanner;

public class NewYear{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int timeTotravel = sObj.nextInt();
        int totalTime = 240;

        totalTime -= timeTotravel;

        int timeToSolve = 0;
        int i = 1;
        while(totalTime>=0){
            if(i-1 >= n){
                System.out.println(n);
                return;
            }
            timeToSolve = i*5;
            totalTime -= timeToSolve;
            if(totalTime < 0){
                System.out.println(i-1);
                return;
            }
            i++;
        }
    }
}