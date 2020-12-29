//Problem: https://codeforces.com/problemset/problem/1144/A

import java.util.Scanner;
import java.util.Arrays;
public class Diverse{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        sObj.nextLine();
        for(int zz=0; zz<css; zz++){
            char[] input = sObj.nextLine().toCharArray();
            // 8
            // "fced" -> |f|c|e|d| -> |c|d|e|f|
            // "xyz"
            // "r"
            Arrays.sort(input);
            // |f|c|e|d| -> |c|d|e|f|
            boolean isContinous = true;
            for(int i=0; i<input.length-1; i++){
                if(input[i+1] - input[i] == 1) continue;
                else{
                    System.out.println("No");
                    isContinous = false;
                    break;
                }
            }
            if(isContinous) System.out.println("Yes");
        }
    }
}