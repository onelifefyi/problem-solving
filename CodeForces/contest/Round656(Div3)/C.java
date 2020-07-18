import java.util.Scanner;
public class C{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        long n = sObj.nextInt();
        for(long z=0; z<n; z++){
            int size = sObj.nextInt();
            long arr[] = new long[size];
            for(int i=0; i<size; i++) arr[i] = sObj.nextInt();
            int count = 1;
            int last = size-1;
            while(last > 0 && (arr[last] <= arr[last-1])){
                count++;
                last--;
            }
            while(last > 0 && (arr[last] >= arr[last-1])){
                count++;
                last--;
            }            
            System.out.println(size-count);
        }
    }
}