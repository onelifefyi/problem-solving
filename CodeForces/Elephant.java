//problem: https://codeforces.com/problemset/problem/617/A

import java.util.Scanner;
public class Elephant{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int input = sObj.nextInt();
        int count=0;
        if(input/5!=0){
            count += input/5;
            input = input%5;
        }
        if(input/4!=0){
            count += input/4;
            input = input%4;
        }
        if(input/3!=0){
            count += input/3;
            input = input%3;
        }
        if(input/2!=0){
            count += input/2;
            input = input%2;
        }
        count += input;
        System.out.println(count);
    }
}