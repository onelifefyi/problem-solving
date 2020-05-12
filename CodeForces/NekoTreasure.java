//problem: https://codeforces.com/problemset/problem/1152/A

import java.util.Scanner;
import java.lang.Math;
public class NekoTreasure{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int chests = sObj.nextInt();
        int keys = sObj.nextInt();
        sObj.nextLine();
        int oddChest = 0;
        int oddKeys = 0;
        for(int i=0; i<chests; i++){
            if(sObj.nextInt() % 2 != 0){
                oddChest++;
            }
        }
        sObj.nextLine();
        for(int j=0; j<keys; j++){
            if(sObj.nextInt() % 2 != 0){
                oddKeys++;
            }
        }
        System.out.println(Math.min(oddChest,keys - oddKeys) + Math.min(chests - oddChest, oddKeys));
    }
}