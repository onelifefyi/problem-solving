import java.util.Scanner;
public class C{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int size = sObj.nextInt();
            int[] arr = new int[size];
            for(int i=0; i<size; i++) arr[i] = sObj.nextInt();
            int max = 0;
            for(int start=0; start<size; start++){
                int localMax = 0;
                int j = start;
                while(j < size){
                    localMax += arr[j];
                    j += arr[j];
                }
                //System.out.println("local max fo " + start + " is " + localMax);
                if(localMax > max) max = localMax;
            }
            System.out.println(max);
        }
    }
}