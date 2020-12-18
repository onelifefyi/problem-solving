// Problem: https://codeforces.com/problemset/problem/1038/A

import java.util.Scanner;
import java.util.Arrays;
public class Equal{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int m = sObj.nextInt();
        sObj.nextLine();
        int[] freq = new int[m];
        for(char ch: sObj.nextLine().toCharArray()){
            //System.out.println(ch);
            freq[ch - 'A'] += 1;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<m; i++){
            if(freq[i] < min) min = freq[i];
        }
        System.out.println(min * m);
        //System.out.println(Arrays.toString(freq));
    }
}