//problem: https://www.codechef.com/problems/HS08TEST

import java.util.Scanner;

public class ATM{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        float required = sObj.nextFloat();
        float bal = sObj.nextFloat();
        if((required%5 == 0) && (bal - (required + 0.50) >= 0)){
            System.out.println(bal - (required + 0.50));
        }
        else{
            System.out.println(bal);
        }
    }
}