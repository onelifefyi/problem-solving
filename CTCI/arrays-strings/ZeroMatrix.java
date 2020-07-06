//problem: Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
//column are set to O. 

// Approach: If we directly keep on putting zeros as we find any element to be zero we will end up
// with the entire matrix being zero;
// We need to store the positions in a list: we can do this in array of length M*N;
// Since we only need info about row and column from the list, other way would be to use set
// to store only the rows and columns whenever we find a zero

//sol: loop through the matrix to get row/col sets O(N+M);
//     iterate through the values in set and set the elements to 0; O(M*N)

import java.util.HashSet;
public class ZeroMatrix{
    public static void main(String[] args){
        int[][] input = {{1,2,3},{4,0,5},{7,8,9}};
        HashSet<Integer> colSet = new HashSet<Integer>();
        HashSet<Integer> rowSet = new HashSet<Integer>();

        for(int row=0; row<input.length; row++){                // O(M*N)
            for(int col=0; col<input[0].length; col++){
                if(input[row][col] == 0){
                    rowSet.add(row);
                    colSet.add(col);
                }
            }
        }
        //System.out.println(rowSet + "\n" + colSet);

        for(int row=0; row<input.length; row++){                    // O(N*M)
            for(int col=0; col<input[0].length; col++){
                if(rowSet.contains(row) || colSet.contains(col)){
                    input[row][col] = 0;
                }
                System.out.print(input[row][col]);
            }
            System.out.println();
        }

    }
}