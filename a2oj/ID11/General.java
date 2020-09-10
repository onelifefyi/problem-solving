// problem #14: https://codeforces.com/problemset/problem/144/A

import java.util.Scanner;

public class General{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n=sObj.nextInt();
        int input[] = new int[n];
        int minInd = 0;
        int maxInd = 0;
        for(int css=0; css<n; css++){
            input[css] = sObj.nextInt();
            if(input[css] > input[maxInd]) maxInd = css;
            if(input[css] <= input[minInd]) minInd = css;
        }
        //System.out.println("min: " + minInd + " max: " + maxInd);
        if(maxInd > minInd) System.out.println(maxInd + (n-1-minInd) - 1);
        else System.out.println(maxInd + (n-1 - minInd));
        sObj.close();
    }
}