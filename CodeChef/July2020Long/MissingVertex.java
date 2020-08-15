// Problem: https://www.codechef.com/JULY20B/problems/PTMSSNG

// Approach: First we need to have a look at properties of vertex of a rectangle,
// we'll realise that every coordinate of a rectangle occurs in pair (2*P) (because it being perpendicular to either axis)
// So if one point is missing, then the missing point should have one unmatched coordinate among the known points.

// So we have to find the uneven coordinate of x and y separately 
// Here i've XORed (1^1 = 0) all the coordinates, this way all the common pair will turn to zero and only uncommon coordinate remains
// which is our final point

import java.util.Scanner;
class MissingVertex{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int x = 0;
            int y = 0;
            int n = sObj.nextInt();
            for(int i=0; i<(n*4) - 1; i++){
                x ^= sObj.nextInt();
                y ^= sObj.nextInt();
            }
            System.out.println(x + " " + y);
        }
    }
}