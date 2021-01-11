import java.util.Scanner;
import java.util.Arrays;
public class Safe{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int size = sObj.nextInt();

        long[] input = new long[size];
        long[] codeArr = new long[size];

        long value = sObj.nextLong();
        long code = sObj.nextLong();

        int p=0;
        while(p < size){
            //System.out.println("P: " + p);
            input[p++] = value%10;
            value /= 10;
        }

        int q=0;
        while(q < size){
            codeArr[q++] = code%10;
            code /= 10;
        }

        // System.out.println(Arrays.toString(input));
        // System.out.println(Arrays.toString(codeArr));

        int count = 0;
        for(int x=0; x<size; x++){
            long toAdd = Math.min(Math.abs(input[x]-codeArr[x]), 9-Math.max(input[x], codeArr[x])+Math.min(input[x], codeArr[x])+1);
            //System.out.println("to add: " + toAdd);
            count += toAdd;
        }
        System.out.println(count);
    }
}