//problem: https://codeforces.com/problemset/problem/867/A

import java.util.Scanner;
public class BetweenOffice{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int days = Integer.parseInt(sObj.nextLine());
        char[] cities = sObj.nextLine().toCharArray();
        char curr, prev = cities[0];
        int StoF=0;
        int FtoS=0;
        for(int i=1; i<days; i++){
            curr = cities[i];
            if(curr==prev){
                continue;
            }
            if(curr=='S' && prev=='F'){
                FtoS++;
            }
            else{
                StoF++;
            }
            prev = curr;
        }
        if(FtoS>=StoF){
            System.out.printf("No");
        }
        else{
            System.out.printf("Yes");
        }
    }
}