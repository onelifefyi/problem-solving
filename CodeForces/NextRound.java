//problem: https://codeforces.com/problemset/problem/158/A
import java.util.Scanner;
public class NextRound{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int cutoff = sObj.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int z=0; z<n; z++) arr[z] = sObj.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i] >= arr[cutoff-1] && arr[i] > 0) count++;
        }
        System.out.println(count);
    }
}