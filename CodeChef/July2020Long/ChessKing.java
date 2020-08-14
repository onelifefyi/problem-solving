//problem: https://www.codechef.com/JULY20B/problems/ADAKING
// Not the most appealing code, but works!

import java.util.Scanner;
class ChessKing{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        char[][] chess = new char[8][8];
        for(int zz=0; zz<css; zz++){
            int k = sObj.nextInt();
            int total = 1;
            chess[0][0] = 'O';
            for(int temp1 = total; total<k; total++) chess[total/8][total%8] = '.';
            int x = 0;
            if(k<8){
                chess[0][total++%8] = 'X';
                for(int ptk=total; ptk<8; ptk++) chess[0][total++%8] = '.';
                x = k+1;
            }
            else if(k%8 != 0) x = 9;
            else if(k>63) x = 0;
            else x = 8;
            for(int temp2 = 0; temp2 < x && total<64; total++,temp2++) chess[(total)/8][(total)%8] = 'X';
            while(total<64){
                chess[(total)/8][(total)%8] = '.';
                total++;
            }
            for(int row=0; row<8; row++){
                for(int col=0; col<8;col++){
                    System.out.print(chess[row][col]);
                }
                System.out.println();
            }
        }
    }
}