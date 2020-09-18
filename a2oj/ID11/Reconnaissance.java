//problem #36: https://codeforces.com/problemset/problem/34/A
import java.util.Scanner;
public class Reconnaissance {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int[] input = new int[n];
        input[0] = sObj.nextInt();
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int diff = 0;
        for(int i=1; i<n; i++){
            input[i] = sObj.nextInt();
            diff =  Math.abs(input[i]-input[i-1]);
            if(min > diff){
                min = diff;
                minIndex = i;
            }
        }
        diff = Math.abs(input[n-1] - input[0]);
        if(min > diff){
            System.out.println(n + " 1");
            return;
        }
        System.out.println(minIndex + " " + (minIndex + 1));
        sObj.close();
    }
}
