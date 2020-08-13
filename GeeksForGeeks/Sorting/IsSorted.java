import java.util.Scanner;

public class IsSorted{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int size = sObj.nextInt();
            int[] arr = new int[size];
            arr[0] = sObj.nextInt();
            boolean isIncorrect = false;
            for(int i=1; i<size; i++){
                arr[i] = sObj.nextInt();
                if(arr[i-1] > arr[i]){
                    System.out.println(1);
                    isIncorrect = true;
                    break;
                }
            }
            if(isIncorrect) System.out.println(0);
            else System.out.println(1);
        }
    }
}