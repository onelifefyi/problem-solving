//problem: https://codeforces.com/problemset/problem/510/A

import java.util.Scanner;
public class SnakeDraw{

    public static void brickDraw(int length){
        for(int i=0; i<length-1; i++){
            System.out.print(".");
        }
    }

    public static void snakeDraw(int length){
        for(int i=0; i<length; i++){
            System.out.print("#");
        }
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int row = sObj.nextInt();
        int col = sObj.nextInt();
        boolean rBody = true;
        for(int i=0; i<row; i++){
            if(i%2 == 0){
                SnakeDraw.snakeDraw(col);
                System.out.println();
            }
            else{
                if(rBody){
                    SnakeDraw.brickDraw(col);
                    System.out.println("#");
                    rBody = false;
                }
                else{
                    System.out.print("#");
                    SnakeDraw.brickDraw(col);
                    System.out.println();
                    rBody = true;
                }
            }
        }
    }
}