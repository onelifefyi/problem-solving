//problem https://codeforces.com/problemset/problem/629/A

import java.util.Scanner;
public class BDcake{
    public static int getComb(int n){
        n = n-1;
        return n*(n+1)/2;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        //System.out.println("n: " + n);
        char[][] input = new char[n][n];
        //char[] temp = new char[n];
        for(int i=0; i<n; i++){
            char[] temp = sObj.nextLine().toCharArray();
            for(int j=0; j<n; j++){
                input[i][j] = temp[j];
            }
        }
        int total = 0;
        int perRC = 0;
        for(int x=0; x<n; x++){
            perRC = 0;
            for(int y=0; y<n; y++){
                if(input[x][y] == 'C'){
                    perRC++;
                }
            }
            total += getComb(perRC);
            //System.out.println("row comb: " + getComb(perRC) + " for #Cs = " + perRC);
        }
        for(int p=0; p<n; p++){
            perRC = 0;
            for(int q=0; q<n; q++){
                if(input[q][p] == 'C'){
                    perRC++;
                }
            }
            total += getComb(perRC);
            //System.out.println("coll comb: " + getComb(perRC) + " for #Cs = " + perRC);
        }
        System.out.println(total);
    }
}