//problem: https://codeforces.com/problemset/problem/732/A

import java.util.Scanner;

public class Shovel{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cost = sObj.nextInt();
        int cash = sObj.nextInt();
        int counter = 1;

        while((cost*counter)%10 != 0){
            //System.out.println("cost: " + (cost*counter) + " counter: " + counter);
            if(((cost*counter)%10) / cash == 1){
                counter += ((cost*counter)%10)/cash - 1;
                break;
            }
            counter++;
        }
        System.out.println(counter);
    }
}