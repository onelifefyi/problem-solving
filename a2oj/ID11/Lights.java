// Problem #6: https://codeforces.com/problemset/problem/275/A
import java.util.Scanner;
public class Lights{

    static int getNeigh(int[][] input, int row, int col){
        //System.out.println("HERE");
        int total=0;
        for(int r=row-1; r<=row+1; r++){
            //System.out.println(r);
            for(int c=col-1; c<=col+1; c++){
                if(r>=0 && r<3 && c>=0 && c<3){
                    if((Math.abs(r - row) + Math.abs(c - col)) > 1) continue;
                    if(input[r][c] == 1) total++;
                }
            }
        }
        //System.out.println("#Neighbours of (" + row + "," + col + "): " + total);
        return total;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int[][] input = new int[3][3];
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++) input[i][j] = sObj.nextInt()%2;
        for(int ii=0; ii<3; ii++){
            for(int jj=0; jj<3; jj++) System.out.print(1-getNeigh(input, ii, jj)%2);
            System.out.println();
        }
    }
}