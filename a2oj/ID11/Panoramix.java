// problem #11: https://codeforces.com/problemset/problem/80/A

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Panoramix{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        // Step 1: Get all prime numbers using sieve of eratosthenes
        int limit = 61;
        Boolean[] prime = new Boolean[limit+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for(int i=2; i<=limit; i++){
            if(prime[i]){
                for(int j=i+i; j<=limit; j+=i){
                    //System.out.println(j + " is not prime");
                    prime[j] = false;
                }
            }
        }
        int n=sObj.nextInt();
        int m=sObj.nextInt();
        for(int i=n+1; i<limit; i++){
            if(prime[i]){
                if(i == m){
                    System.out.println("YES");
                    return;
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }
        }
    }
}