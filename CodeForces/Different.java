//problem: https://codeforces.com/problemset/problem/672/B

import java.util.Scanner;
import java.util.Arrays;
public class Different{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        if(n>26){
            System.out.println(-1);
            return;
        }
        char[] arr = sObj.nextLine().toCharArray();
        Boolean[] bArr = new Boolean[26];
        Arrays.fill(bArr, false);
        int count = 0;
        int totalChar = 0;
        for(char ele: arr){
            if(bArr[ele%26] == true){
                count++;
            }
            else{
                bArr[ele%26] = true;
                totalChar++;
            }
        }
        System.out.println(count);
        
    }
}
