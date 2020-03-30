//problem: https://codeforces.com/problemset/problem/996/A

import java.util.Scanner;
public class Lottery{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int balance = Integer.parseInt(sObj.nextLine());
        int count = 0;
        if(balance/100 !=0){
            count += balance/100;
            balance = balance%100;
            //System.out.println("100:"+balance);
        }
        if(balance/20 !=0){
            count += balance/20;
            balance = balance%20;
            //System.out.println("20:"+balance);
        }
        if(balance/10 !=0){
            count += balance/10;
            balance = balance%10;
            //System.out.println("10:"+balance);
        }
        if(balance/5 !=0){
            count += balance/5;
            balance = balance%5;
            //System.out.println("5:"+balance);
        }
        count += balance;
        System.out.print(count);
    }
}