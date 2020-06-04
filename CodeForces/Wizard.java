//problem: https://codeforces.com/problemset/problem/168/A

import java.util.Scanner;
import java.lang.Math;
public class Wizard{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int total = sObj.nextInt();
        int wiz = sObj.nextInt();
        int percent = sObj.nextInt();
        if(Math.ceil(total*percent/100.0) <= wiz){
            System.out.println(0);
            return;
        }
        System.out.println((int) Math.ceil((total * percent / 100.0) - wiz));
    }
}