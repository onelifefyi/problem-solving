// problem:  https://www.codechef.com/JULY20B/problems/CHEFSTR1

//analysis: I was getting an error because I took total as int,
// it would over flow if we end up adding values upto 10^6 multiple times

import java.util.Scanner;
class Guitar{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int iterations = sObj.nextInt();
            int first = sObj.nextInt();
            long total = 0;
            for(int i=0; i<iterations-1; i++){
                int second = sObj.nextInt();
                if(first == second) continue;                   // suppose we got same string
                total += Math.abs(first - second) - 1;
                first = second;
            }
            System.out.println(total);
        }
    }
}