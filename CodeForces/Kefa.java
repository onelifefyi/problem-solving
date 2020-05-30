//problem: https://codeforces.com/problemset/problem/841/A

import java.util.Scanner;

public class Kefa{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int bloons = sObj.nextInt();
        int frnds = sObj.nextInt();
        sObj.nextLine();
        int[] freq = new int[128];
        for(char c: sObj.nextLine().toCharArray()){
            freq[c]++;
        }
        int uniq = 0;
        int max = 0;
        for(int i=0; i<127; i++){
            if(freq[i] > max){
                max = freq[i];
            }
        }
        if(frnds>=max){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        } 
        //System.out.println("max: " + max);
    }
}