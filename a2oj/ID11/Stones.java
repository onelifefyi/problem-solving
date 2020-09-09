// problem #10: https://codeforces.com/problemset/problem/266/A

import java.util.Scanner;
public class Stones{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        sObj.nextLine();
        char[] input = sObj.nextLine().toCharArray();
        int count = 0;
        for(int i=1; i<n; i++){
            if(input[i] == input[i-1]){
                count++;
                input[i] = input[i-1];
            }
        }
        System.out.println(count);
    }
}