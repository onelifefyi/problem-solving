// problem: https://www.codechef.com/AUG20B/problems/LINCHESS
import java.util.Scanner;
import java.util.Arrays;

class LinearChess{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int z=0; z<css; z++){
            int players = sObj.nextInt();
            int toCapture = sObj.nextInt();
            int[] positions = new int[players];
            int pivotLoc = 0;
            for(int zz=0; zz<players; zz++){
                positions[zz] = sObj.nextInt();
                if(positions[zz] < toCapture) pivotLoc = zz;
            }
            //System.out.println("pivot: " + pivotLoc);
            Arrays.sort(positions);
            boolean found = false;
            for(int i=pivotLoc; i>=0; i--){
                if(toCapture%positions[i] == 0){
                    System.out.println(positions[i]);
                    found = true;
                    break;
                }
            }
            if(!found) System.out.println(-1);
        }
    }
}