//problem: https://codeforces.com/problemset/problem/268/A

import java.util.Scanner;
public class Uniform{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        int[] home = new int[n];
        int[] away = new int[n];
        for(int i=0; i<n; i++){
            home[i] = sObj.nextInt();
            away[i] = sObj.nextInt();
            sObj.nextLine();
        }
        int awayCount = 0;
        for(int hEle: home){
            for(int aEle: away){
                if(hEle == aEle){
                    awayCount++;
                }
            }
        }
        System.out.println(awayCount);
    }
}