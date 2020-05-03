//problem: https://codeforces.com/problemset/problem/255/A

import java.util.Scanner;
public class Workout{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int chestCount = 0;
        int bicepsCount = 0;
        int backCount = 0;
        int total = Integer.parseInt(sObj.nextLine());
        for(int i=1; i<=total; i++){
            if(i % 3 == 1){
                chestCount += sObj.nextInt();
            }
            else if(i % 3 == 2){
                bicepsCount += sObj.nextInt();
            }
            else if(i % 3 == 0){
                backCount += sObj.nextInt();
            }
        }
        if(chestCount>bicepsCount){
            if(chestCount > backCount){
                System.out.println("chest");
            }
        }
        if(bicepsCount>chestCount){
            if(bicepsCount > backCount){
                System.out.println("biceps");
            }
        }
        if(backCount>chestCount){
            if(backCount > bicepsCount){
                System.out.println("back");
            }
        }
    }
}