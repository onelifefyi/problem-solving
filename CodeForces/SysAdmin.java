//problem: https://codeforces.com/problemset/problem/245/A

import java.util.Scanner;
public class SysAdmin{
    public static void main(String[ ] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        int aCnt, bCnt;
        aCnt = bCnt = 0;
        int aTotal, bTotal;
        aTotal = bTotal = 0;
        int inputServer = 0;

        for(int i=0; i<n; i++){
            inputServer = sObj.nextInt();
            if(inputServer == 1){
                aCnt++;
                aTotal += sObj.nextInt();
            }
            else{
                bCnt++;
                bTotal += sObj.nextInt();
            }
            sObj.nextLine();
        }
        //System.out.printf("Total PING: a=%d b=%d\nTotal returned: a=%d b=%d \n", aCnt, bCnt, aTotal, bTotal);
        if(aTotal/aCnt >= 5){
            System.out.println("LIVE");
        }
        else{
            System.out.println("DEAD");
        }
        if(bTotal/bCnt >=5){
            System.out.println("LIVE");
        }
        else{
            System.out.println("DEAD");
        }
    }
}