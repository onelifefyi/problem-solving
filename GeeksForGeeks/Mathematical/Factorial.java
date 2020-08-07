// problem: https://practice.geeksforgeeks.org/problems/factorial/0

import java.util.Scanner;
public class Factorial{

    static int getFact(int num){
        if(num == 1) return 1;
        else return num * getFact(num-1);
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        System.out.println(getFact(5));
    }
}