//problem: https://codeforces.com/problemset/problem/822/B

import java.util.Scanner;

public class Xword{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        sObj.nextLine();
        char[] s = sObj.nextLine().toCharArray();
        char[] t = sObj.nextLine().toCharArray();
        int bestindex = 0;
        int score = 0;
        int maxScore = 0;
        for(int i=0; i<=t.length - s.length; i++){
            score = 0;
            for(int j=0; j<s.length; j++){
                //System.out.println("comparing: " + j + " " + (j+i));
                if(s[j] == t[j+i]){
                    score++;
                }
            }
            if(maxScore < score){
                maxScore = score;
                bestindex = i;
            }
        }
        //System.out.println("maxscore: " + maxScore);
        //System.out.println("bestindex: " + bestindex);
        System.out.println(s.length - maxScore);
        for(int z=0; z<s.length; z++){
            if(s[z] != t[z + bestindex]){
                System.out.print((z+1) + " ");
            }
        }
    }
}