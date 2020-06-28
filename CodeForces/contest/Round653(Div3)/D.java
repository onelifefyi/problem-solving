import java.util.Scanner;
import java.util.Arrays;
public class D{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int z=0; z<nos; z++){
            int size = sObj.nextInt();
            int[] arr = new int[size];
            int divisor = sObj.nextInt();
            for(int i=0; i<size; i++){
                arr[i] = sObj.nextInt();
            }
            Arrays.sort(arr);
            int moves = 0;
            int x = 0;
            int current = 0;
            for(int zz=size-1; zz>=0; zz--){
                current = arr[zz];
                while(arr[zz] % divisor != 0){
                    if((current + x)%divisor == 0){
                        moves++;
                        x++;
                        break;
                    }
                    else{
                        if((current + x)%divisor == 0){
                            moves++;
                            x++;
                            break;
                        }
                        else{
                            arr[zz] += x;
                            moves++;
                            x++;
                        }
                    }
                }
            }
            System.out.println("ans: " + moves);
        }
    }
}