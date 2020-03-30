//problem: https://codeforces.com/problemset/problem/705/A

import java.util.Scanner;
public class AHulk{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int num = Integer.parseInt(sObj.nextLine());
        for(int i=1; i<=num; i++){
            if(i%2==0){
                System.out.print("I love");
            }
            else{
                System.out.print("I hate");
            }
            if(i!=num){
                System.out.print(" that ");
            }
        }
        System.out.print(" it");
    }
}