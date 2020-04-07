//problem: https://codeforces.com/problemset/problem/734/A

import java.util.Scanner;
public class Chess{
    public static void main(String args[]){
        Scanner sObj = new Scanner(System.in);
        sObj.nextLine();
        int a = 0;
        int d = 0;
        char[] input = sObj.nextLine().toCharArray();
        for(char ele: input){
            if(ele == 'A'){
                a++;
            }
            else {
                d++;
            }
        } 
        if(a > d){
            System.out.print("Anton");
        }
        else if(a < d){
            System.out.print("Danik");
        }
        else {
            System.out.print("Friendship");
        }
    }
}