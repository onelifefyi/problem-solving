//problem:  Given an image represented by an NxN matrix, where each pixel in the image is 4
// bytes, write a method to rotate the image by 90 degrees. (an you do this in place? 

//approach: 2 stage method: First find transpose, then swap the left and right columns O(N^2)

//NB not my solution, taken from Nick's youtube vid, which he took from "luckidiot" (LoL!)

public class RotateMatrix{

    public static void rotate(char[][] matrix){
        int N = matrix.length;

        //finding transpose
        for(int i=0; i<N; i++){             // O(N^2)   //where N is #rows/columns 
            for(int j=i; j<N; j++){
                char tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        // for(int x=0; x<matrix.length; x++){
        //     for(int y=0; y<matrix.length; y++){
        //         System.out.print(matrix[x][y] + " ");
        //     }
        //     System.out.println();
        // }

        // swapping columns left <-> right
        for(int i=0; i<N; i++){                 // O(N^2)
            for(int j=0; j<N/2; j++){
                char tmp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = tmp;
            }
        }
    }

    public static void main(String[] args){
        char[][] matrix = {{'a','b','c'}, {'d','e','f'}, {'g','h','i'}};
        System.out.println("Input: ");
        for(int x=0; x<matrix.length; x++){
            for(int y=0; y<matrix.length; y++){
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();
        }
        RotateMatrix.rotate(matrix);
        System.out.println("\nOutput: ");
        for(int x=0; x<matrix.length; x++){
            for(int y=0; y<matrix.length; y++){
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();
        }
    }
}