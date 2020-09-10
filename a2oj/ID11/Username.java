// problem #18: https://codeforces.com/problemset/problem/155/A

import java.util.Scanner;

public class Username{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int point = sObj.nextInt();
        int max, min;
        max = min = point;
        int total = 0;
        for(int i=1; i<n; i++){
            point = sObj.nextInt();
            if(point > max){
                total++;
                max = point;
            }
            if(point < min){
                total++;
                min = point;
            }
        }
        System.out.println(total);
    }
}