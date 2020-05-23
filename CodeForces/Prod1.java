//problem: https://codeforces.com/problemset/problem/1206/B

import java.util.Scanner;
import java.lang.Math;
public class Prod1{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        long nos = sObj.nextLong();
        long temp = 0;
        long zeros = 0;
        long cost = 0;
        long prod = 1;
        for(long i=0; i<nos; i++){
            temp = sObj.nextLong();
            if(temp == 0){
                zeros++;
                continue;
            }
            else if(Math.abs(temp) != 1){
                cost += Math.abs(temp) - 1; 
            }
            if(temp < 0){
                prod *= -1;
            }
        }
        
        //System.out.println("total: " + cost + " zeros: " +  zeros + " prod: " + prod);
        if(zeros > 0){
            System.out.println(cost + zeros);
        }
        else{
            if(prod<0){
                System.out.println(cost + 2);
            }
            else{
                System.out.println(cost);
            }
        }
    }
}