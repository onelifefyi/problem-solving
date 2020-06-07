//problem: https://codeforces.com/problemset/problem/766/B
import java.util.Scanner;
import java.util.Arrays;

public class Triangle{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        int[] arr = new int[nos];
        for(int i=0; i<nos; i++){
            arr[i] = sObj.nextInt();
        }
        Arrays.sort(arr);
        for(int z=0; z<nos-2; z++){
            if((arr[z] + arr[z+1] > arr[z+2]) && (arr[z+1] + arr[z+2] > arr[z]) && (arr[z] + arr[z+2] > arr[z+1])){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}