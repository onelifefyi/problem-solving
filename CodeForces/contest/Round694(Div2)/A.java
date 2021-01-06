import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int size = sObj.nextInt();
            long x = sObj.nextLong();
            long[] arr = new long[size];
            long sum = 0;
            long divSum = 0;
            for(int i=0; i<size; i++){
                arr[i] = sObj.nextInt();
                sum += arr[i];
                divSum += Math.ceil(arr[i]*1.0/x);
            }
            System.out.print((long)Math.ceil(sum*1.0/x) + " ");
            System.out.print(divSum + "\n");
        }
    }
}