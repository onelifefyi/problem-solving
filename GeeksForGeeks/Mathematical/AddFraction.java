// Problem: https://practice.geeksforgeeks.org/problems/add-two-fractions/1
import java.util.Scanner;
import java.lang.Math;
public class AddFraction{

    static int GCD(int a, int b){
        if(b == 0) return a;
        else return GCD(b, a%b);
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int num1 = sObj.nextInt(); int den1 = sObj.nextInt();
        sObj.nextLine();
        int num2 = sObj.nextInt(); int den2 = sObj.nextInt();
        int GCD = GCD(Math.max(den1, den2), Math.min(den1, den2));
        int LCM = (den1 * den2) / GCD;
        System.out.println((num1*(LCM/den1)) + (num2*(LCM/den2)) + "/" + LCM);
    }
}