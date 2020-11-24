import java.util.Arrays;
import java.util.Scanner;

public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            boolean found = false;
            int result = 0;
            int n = sObj.nextInt();
            int[] arr = new int[n+2];
            int[] arr2 = new int[n+2];
            arr[0] = -1;
            arr[n+1] = Integer.MAX_VALUE;
            for(int i=1; i<=n; i++){
                arr[i] = sObj.nextInt();
                arr2[i-1] = arr[i];
            }
            Arrays.sort(arr);
            //System.out.println("sorted arr: " + Arrays.toString(arr));
            for(int j=1; j<=n; j++){
                if(arr[j]!=arr[j-1] && arr[j]!=arr[j+1]){
                    found = true;
                    result = arr[j];
                    break;
                }
            }
            //System.out.println("result: " + result);
            if(!found) System.out.println(-1);
            else{
                for(int x=0; x<n; x++){
                    if(arr2[x] == result){
                        System.out.println(x+1);
                        break;
                    }
                }
            }
        }
    }
}