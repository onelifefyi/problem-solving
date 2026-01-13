//problem: https://www.codechef.com/JUNE20B/problems/PRICECON

import java.util.Scanner;

class PriceControl{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int N = sObj.nextInt();
            int K = sObj.nextInt();
            int loss = 0;
            for(int i=0; i<N; i++){
                int temp = sObj.nextInt();
                if(temp > K) loss += temp - K;
            }
            System.out.println(loss);
        }
    }
}