import java.util.Arrays;
import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        for(int i = 0; i<n; i++){
            int[] arr = new int[3];
            for(int z=0; z<3; z++) arr[z] = sObj.nextInt();
            Arrays.sort(arr);
            if(arr[1] == arr[2]){
                System.out.println("YES");
                System.out.println(arr[0] + " " + arr[0] + " " + arr[2]);
            }
            else System.out.println("NO");
        }
    }
}