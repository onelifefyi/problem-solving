//problem: https://codeforces.com/problemset/problem/959/A

import java.util.Scanner;
public class SelectionGame{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int num = sObj.nextInt();
        if(num%2==0){
            System.out.print("Mahmoud");
        }
        else{
            System.out.print("Ehab");
        }
    }
}
