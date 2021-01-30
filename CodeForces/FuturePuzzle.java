// https://codeforces.com/problemset/problem/1474/A (incomplete)
import java.util.Arrays;
import java.util.Scanner;
public class FuturePuzzle{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int size = sObj.nextInt();
            int[] arr = new int[size];
            int[] result = new int[size];
            //sObj.nextLine();
            int i=0;
            for(char ch: sObj.next().toCharArray()) result[i++] = ch - '0';
            arr[0]++;
            result[0] = 1;
            for(int j=1; j<size-1; j++){
                if(arr[j]+1 == arr[j-1]) result[j] = 0;
                else{
                    arr[j]++;
                    result[j] = 1;
                }
            }
            System.out.println(Arrays.toString(result));
        }
    }
}