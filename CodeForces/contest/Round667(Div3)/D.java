// problem: https://codeforces.com/contest/1409/problem/D
// Didn't submit (Couldn't solve yet)
import java.util.Scanner;
import java.util.ArrayList;
public class D{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            long num = sObj.nextLong();
            int sum = sObj.nextInt();
            int temp = num;
            int sumNum = 0;
            while(temp > 0){
                sumNum += temp%10;
                temp /= 10;
            }
            if(sumNum < sum){
                System.out.println(0); 
                break;
            }
            else{
                int diffNeeded = sumNum - sum;
                int zerosNeeded = 0;
                int numTemp = 
                int temp2 = 0;
                while(temp2 < diffNeeded){
                    temp2
                }
            }
        }
    }
}