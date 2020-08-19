// problem: https://www.codechef.com/JUNE20B/problems/EVENM
import java.util.Scanner;

class EvenMat{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        sObj.nextLine();
        for(int zz=0; zz<css; zz++){
            StringBuilder sOut = new StringBuilder();
            int N = sObj.nextInt();
            int[][] mat = new int[N][N];
            int numEve = 2;
            int numOdd = 1;
            for(int row=0; row<N; row++){
                if(row%2==0){
                    for(int i=0; i<N; i+=2){
                        mat[row][i] = numOdd;
                        numOdd+=2;
                    }
                    for(int j=1; j<N; j+=2){
                        mat[row][j] = numEve;
                        numEve+=2;
                    }
                }
                else{
                    for(int ii=0; ii<N; ii+=2){
                        mat[row][ii] = numEve;
                        numEve+=2;
                    }
                    for(int jj=1; jj<N; jj+=2){
                        mat[row][jj] = numOdd;
                        numOdd+=2;
                    }
                }
            }
            for(int x=0; x<N; x++){
                for(int y=0; y<N; y++){
                    sOut.append(mat[x][y] + " ");
                }
                sOut.append("\n");
            }
            System.out.println(sOut);
        }
    }
}