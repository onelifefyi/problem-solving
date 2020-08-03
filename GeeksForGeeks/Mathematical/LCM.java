// problem: https://practice.geeksforgeeks.org/problems/lcm-and-gcd/0
import java.util.Scanner;
import java.lang.Math;
public class LCM{

    static int GCD(int a, int b){
        if(b == 0) return a;
        else return GCD(b, a%b);
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        for(int i=0; i<n; i++){
            int a = sObj.nextInt();
            int b = sObj.nextInt();
            sObj.nextLine();
            int GCD = GCD(Math.max(a,b), Math.min(a,b));
            int LCM = (a * b) / GCD;
            System.out.println("LCM: " + LCM + " GCD: " + GCD);
        }
    }
}