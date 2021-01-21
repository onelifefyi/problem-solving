// Find all the prime numbers below given number
import java.util.Scanner;
import java.util.Arrays;
public class PrimeTill{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int[] arr = new int[n];
        for(int zz=0; zz<n; zz++) arr[zz] = zz;
        for(int i=2; i<n; i++){
            if(arr[i] > 0){
                int temp = arr[i] + i;
                while(temp < n){
                    if(arr[temp] > 0) arr[temp] *= -1;
                    temp += arr[i];
                }
            }
        }
        for(int ele: arr) if(ele > 0) System.out.println(ele);
    }
}