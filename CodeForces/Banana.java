//problem: https://codeforces.com/problemset/problem/546/A

import java.util.Scanner;

public class Banana{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cost1 = sObj.nextInt();
        int cash = sObj.nextInt();
        int noBan = sObj.nextInt();
        int totalCost = 0;
        int counter = 1;
        while(counter <= noBan){
            totalCost += cost1*counter;
            counter++;
        }
        if(totalCost > cash){       
            System.out.println(totalCost - cash);
        }
        else{
            System.out.println(0);
        }
    }
}