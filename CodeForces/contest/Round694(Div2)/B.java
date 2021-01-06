import java.util.Scanner;
import java.util.ArrayList;
public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int size = sObj.nextInt();
            long x = sObj.nextLong();
            long masterSum = 0;
            boolean deadlock = false;
            long input[] = new long[size];
            ArrayList<Long> arr = new ArrayList<Long>();
            long temp = 0;
            for(int i=0; i<size; i++) arr.add(sObj.nextLong());
            while(arr.size()!=0){
                //System.out.println(arr + " sum: " + masterSum);
                temp = arr.remove(0);
                if(temp%x==0 && !deadlock){
                    for(int m=0; m<x; m++) arr.add(temp/x);
                }
                else deadlock = true;
                masterSum += temp;
            }
            System.out.println(masterSum);
        }
    }
}