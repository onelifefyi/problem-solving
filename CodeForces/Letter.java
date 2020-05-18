//problem: https://codeforces.com/problemset/problem/14/A

import java.util.Scanner;

public class Letter{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int rows = sObj.nextInt();
        int columns = sObj.nextInt();
        sObj.nextLine();
        int[] col = {-1, -1};
        int[] row = {-1, -1};
        boolean gotColumn = false;
        String[] input = new String[rows];
        for(int i=0; i<rows; i++){
            input[i] = sObj.nextLine();
        }
        for(int x=0; x<rows; x++){
            for(int y=0; y< columns; y++){
                if(input[x].charAt(y) == '*' && !gotColumn){
                    col[0] = x;
                    col[1] = x;
                    gotColumn = true;
                }
                if(input[x].charAt(y) == '*'){
                    if(y<=col[0]){
                        col[0] = y;
                    }
                    else if(y>= col[1]){
                        col[1] = y;
                    }
                    col[1] = x;
                }
            }
        }
        System.out.println("rowstart: " + row[0] + " rowend: " + row[1] + " coll start: " + col[0] + " coll end: " + col[1]);
    }
}