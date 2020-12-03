// Problem: https://codeforces.com/problemset/problem/919/A

import java.util.Scanner;

public class SuperMarket{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        float n = sObj.nextFloat();
        float numApple = sObj.nextFloat();
        float min = Float.MAX_VALUE;
        for(int i=0; i<n; i++){
            float tempA = sObj.nextFloat();
            float tempB = sObj.nextFloat();
            if(tempA/tempB < min) min = tempA/tempB;
        }
        System.out.println(min*numApple);
    }
}