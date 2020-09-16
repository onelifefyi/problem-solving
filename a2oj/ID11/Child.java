// problem #32: https://codeforces.com/problemset/problem/450/A

import java.util.Scanner;
public class Child{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int m = sObj.nextInt();
        int maxIndex=n;
        int maxValue=0;
        for(int i=1; i<=n; i++){
            float temp = sObj.nextFloat();
            if(Math.ceil(temp/m) >= maxValue){
                maxValue = (int) Math.ceil(temp/m);
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
        sObj.close();
    }
}