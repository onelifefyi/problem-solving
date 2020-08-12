// problem: https://www.codechef.com/JULY20B/problems/CRDGAME

import java.util.Scanner;
class CardGame{

    static int getSum(int n){
        int total = 0;
        while(n != 0){
            total += n%10;
            n /= 10;
        }
        return total;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int iterations = sObj.nextInt();
            int chefTotal = 0;
            int mortyTotal = 0;
            for(int i=0; i<iterations; i++){
                int cTemp = getSum(sObj.nextInt());
                int mTemp = getSum(sObj.nextInt());
                if(cTemp > mTemp) chefTotal++;
                else if(mTemp > cTemp) mortyTotal++;
                else{
                    mortyTotal++;
                    chefTotal++;
                }
            }
            if(chefTotal > mortyTotal) System.out.println("0 " + chefTotal);
            else if(mortyTotal > chefTotal) System.out.println("1 " + mortyTotal);
            else System.out.println("2 " + chefTotal);
        }
    }
}