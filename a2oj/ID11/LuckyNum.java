// problem #9: https://codeforces.com/problemset/problem/110/A

import java.util.Scanner;

public class LuckyNum{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int luckyCount = 0;
        for(char ch: sObj.nextLine().toCharArray())
            if(ch == '4' || ch == '7') luckyCount++;
        
        //System.out.println("Lucky count: " + luckyCount);
        if(luckyCount == 4 || luckyCount == 7){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}