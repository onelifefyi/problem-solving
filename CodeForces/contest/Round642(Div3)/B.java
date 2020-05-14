import java.util.Scanner;
import java.util.Arrays;
public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = Integer.parseInt(sObj.nextLine());
        for(int i=0; i<cases; i++){
            int size = sObj.nextInt();
            int k = sObj.nextInt();
            int[] arrA = new int[size];
            int[] arrB = new int[size];
            for(int x=0; x<size; x++){
                arrA[x] = sObj.nextInt();
            }
            for(int y=0; y<size; y++){
                arrB[y] = sObj.nextInt();
            }
            sObj.nextLine();
            Arrays.sort(arrA);
            Arrays.sort(arrB);
            for(int p=0; p<k; p++){
                if(arrA[p] < arrB[size-1-p]){
                    arrA[p] = arrB[size-1-p];
                }
            }
            int sum = 0;
            for(int ele: arrA){
                //System.out.println("ele: " + ele);
                sum += ele;
            }
            System.out.println(sum);
        }
    }
}