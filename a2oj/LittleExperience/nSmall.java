// problem: https://a2oj.com/p?ID=159
import java.util.Scanner;
import java.util.Arrays;
class nSmall{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int arr[] = new int[10];
            for(int i=0; i<10; i++) arr[i] = sObj.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}