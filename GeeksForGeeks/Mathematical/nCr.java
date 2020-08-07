// problem: https://practice.geeksforgeeks.org/problems/ncr/0
import java.util.Scanner;
public class nCr{

    static int findFact(int n){
        if(n<=1) return 1;
        else return n*findFact(n-1);
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int r = sObj.nextInt();
        System.out.println(findFact(n)/(findFact(n-r)*findFact(r)));
    }
}