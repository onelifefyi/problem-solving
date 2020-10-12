import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int n = sObj.nextInt();
            int temp = 0;
            ArrayList<Integer> positive = new ArrayList<Integer>();
            ArrayList<Integer> negative = new ArrayList<Integer>();
            int negativeSum = 0;
            int positiveSum = 0;
            for(int i=0; i<n; i++){
               temp = sObj.nextInt();
               if(temp >= 0){
                   positiveSum+=temp;
                   positive.add(temp);
               }
               else{
                negativeSum+=temp;
                negative.add(temp);                   
               }
            }
            if(positiveSum + negativeSum == 0){
                System.out.println("NO");
                continue;
            }
            else{
                if(positiveSum + negativeSum > 0){
                    System.out.println("YES");
                    for(int pos: positive) System.out.print(pos + " ");
                    for(int neg: negative) System.out.print(neg + " ");
                }
                else{
                    System.out.println("YES");
                    for(int neg: negative) System.out.print(neg + " ");
                    for(int pos: positive) System.out.print(pos + " ");
                }
            }
            System.out.println();
        }
    }
}