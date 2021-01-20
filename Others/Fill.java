import java.util.Scanner;
import java.util.Arrays;
public class Fill{
    public static void main(String[] args){
        char[][] matrix = new char[10][10];
        Scanner sObj = new Scanner(System.in);
        for(char[] row: matrix) Arrays.fill(row, '*');
        char[] verticalInput = sObj.next().toCharArray();
        int x = sObj.nextInt();
        int tempX = x;
        int y = sObj.nextInt();
        sObj.nextLine();
        char[] horizontalInput = sObj.next().toCharArray();
        for(char ch: verticalInput) matrix[tempX++][y] = ch;

        char common = verticalInput[0];
        int commonIndexX = 0;
        int commonIndexY = 0;
        for(int xx=0; xx<verticalInput.length; xx++){
            for(int yy=0; yy<horizontalInput.length; yy++){
                if(verticalInput[xx] == horizontalInput[yy]){
                    commonIndexX = yy;
                    commonIndexY = xx;
                }
            }
        }

        commonIndexY += x ;
        //System.out.println(commonIndexX + " " + commonIndexY);

        int index = 0;
        for(int aa=y-commonIndexX; aa<horizontalInput.length+(y-commonIndexX); aa++){
            matrix[commonIndexY][aa] = horizontalInput[index++];
        }
        // while(left>=commonIndexX){
        //     matrix[commonIndexY][left] = horizontalInput[left];
        //     left--;
        // }
        // int right = commonIndexX;
        // while(right<horizontalInput.length){
        //     matrix[commonIndexY][right] = horizontalInput[right];
        //     right++;
        // }

        for(int p=0; p<10; p++){
            for(int q=0; q<10; q++) System.out.print(matrix[p][q] + " ");
            System.out.println();
        }
    }
}