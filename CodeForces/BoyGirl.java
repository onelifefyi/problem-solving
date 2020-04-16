//problem: https://codeforces.com/problemset/problem/236/A

import java.util.Scanner;
import java.util.HashSet;
public class BoyGirl{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        HashSet charSet = new HashSet();
        for(char c: sObj.nextLine().toCharArray()){
            charSet.add(c);
        }
        if(charSet.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}