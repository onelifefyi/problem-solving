// Problem: http://codeforces.com/problemset/problem/1334/B
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class MiddleClass{
    // public static void main(String[] args){
    //     Scanner sObj = new Scanner(System.in);
    //     double css = sObj.nextDouble();
    //     for(int zz=0; zz<css; zz++){
    //         int n = sObj.nextInt();
    //         double t = sObj.nextDouble();
    //         double[] input = new double[n];
    //         for(int i=0; i<n; i++) input[i] = sObj.nextDouble();
    //         Arrays.sort(input);
    //         int right = n-1;
    //         int left = 0;
    //         int count = 0;
    //         while(left <= right){
    //             double mid = (input[left] + input[right])/2;
    //             if(mid >= t){
    //                 count += 2;
    //                 input[left++] = mid;
    //                 input[right--] = mid;
    //             }
    //             else left++;
    //         }
    //         //if(right==left && input[right] >= t) count++;
    //         System.out.println(count);
    //     }
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        double css = sObj.nextDouble();
        for(int zz=0; zz<css; zz++){
            int n = sObj.nextInt();
            double t = sObj.nextDouble();
            double[] input = new double[n];
            double totalSum = 0;
            for(int i=0; i<n; i++){
                input[i] = sObj.nextDouble();
                totalSum += input[i];
            }
            Arrays.sort(input);
            int mod = 1;
            int globalCount = 0;
            double sumTillNow = 0;
            if(totalSum/n >= t){
                System.out.println(n);
                continue;
            }
            for(int last=n-1; last>=0; last--){
                int localCount = 0;
                sumTillNow += input[last];
                if(sumTillNow/mod++ >= t){
                    localCount = n-last;
                    if(localCount > globalCount) globalCount = localCount;
                }
                else break;
            }
            System.out.println(globalCount);
        }
    }
}