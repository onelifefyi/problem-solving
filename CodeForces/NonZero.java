//problem: https://codeforces.com/problemset/problem/1300/A

import java.util.Scanner;
public class NonZero{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = Integer.parseInt(sObj.nextLine());
        int noEle = 0;
        int sum = 0;
        int zeroCount = 0;
        int current = 0;
        for(int i=0; i<cases; i++){
            noEle = Integer.parseInt(sObj.nextLine());
            sum = 0;
            for(int j=0; j<noEle; j++){
             current = sObj.nextInt();
             System.out.print("c" + current + " ");
             if(current == 0){
                 zeroCount++;
             }
             sum += current;
            }
            if(zeroCount != 0){
                System.out.println("o" + zeroCount);
            }
            else if(sum == 0){
                System.out.println("o" + 1);
            }
            System.out.println();
            zeroCount = 0;
            sObj.nextLine();
        }
    }
}