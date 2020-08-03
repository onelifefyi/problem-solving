// Problem: https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers/0
import java.util.Scanner;
import java.lang.Math;
public class GCD{

    // Better Approach: Euclid's Method
    static int findGCDEuclid(int a, int b){
        if(b == 0) return a;
        else return findGCDEuclid(b, a%b);
    }

    // Brute Force
    static int findGCD(int a, int b){
        int min = b;
        while(min >= 1){
            if(a%min == 0 && b%min == 0) return min;
            min--;
        }
        return min;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        for(int i=0; i<n; i++){
            int a = sObj.nextInt();
            int b = sObj.nextInt();
            sObj.nextLine();
            System.out.println("Brute: " + findGCD(Math.max(a,b), Math.min(a,b)));
            System.out.println("Euclid: " + findGCDEuclid(Math.max(a,b), Math.min(a,b)));
        }
    }
}