//problem #33 : https://codeforces.com/problemset/problem/165/A

// Brute O(N^2)
import java.util.Scanner;
import java.util.Arrays;
public class Supercentral {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int[] input = new int[2*n];
        int result = 0;
        boolean[] flag = new boolean[4];
        int trueCount = 0;
        for(int i=0; i<2*n; i++) input[i] = sObj.nextInt();
        
        for(int ii=0; ii<n*2; ii+=2){
            Arrays.fill(flag, false);
            for(int x=0; x<2*n; x+=2){
                if(ii == x) continue;
                // System.out.println("x: " + input[ii] + " y: " + input[ii+1]);
                // System.out.println("x': " + input[x] + " y': " + input[x+1]);
                if(input[x] == input[ii] && input[x+1] < input[ii+1]) flag[0] = true;
                if(input[x] == input[ii] && input[x+1] > input[ii+1]) flag[1] = true;
                if(input[x+1] == input[ii+1] && input[x] < input[ii]) flag[2] = true;
                if(input[x+1] == input[ii+1] && input[x] > input[ii]) flag[3] = true;
                trueCount=0;
                for(boolean val: flag) if(val) trueCount++;
                if(trueCount == 4){
                    result++;
                    //System.out.println("found: " + input[ii] + "," + input[ii+1]);
                    break;
                }
            }
        }
        System.out.println(result);
        sObj.close();
    }
}
