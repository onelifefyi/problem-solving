//problem: https://www.codechef.com/problems/FLOW006/

import java.util.Scanner;
class SumDigit{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        for(int i=0; i<n; i++){
            int sum = 0;
            int num = sObj.nextInt();
            while(num != 0){
                sum += num%10;
                num /= 10;
            }
            System.out.println(sum);
        }
    }
}