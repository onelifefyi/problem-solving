// Problem: https://codeforces.com/problemset/problem/1468/N

import java.util.Scanner;
public class Waste{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        // for(int zz=0; zz<css; zz++){
        //     int[] capacity = new int[3];
        //     boolean possible = true;
        //     // capacity[0] -> paper 2
        //     // capacity[1] -> plastic 2
        //     // capacity[2] -> other 3
            
        //     // Capacity
        //     for(int j=0; j<3; j++) capacity[j] = sObj.nextInt();
        //     for(int i=0; i<3; i++){
        //         capacity[i] -= sObj.nextInt();   // 1 0 0
        //         if(capacity[i]<0) possible = false;
        //     }
        //     int partialPaper = sObj.nextInt();  // 0
        //     int partialPlastic = sObj.nextInt();    // 1
        //     if(capacity[0] + capacity[2] < partialPaper) possible = false; // 1+0<0? false
        //     else if(partialPaper != 0) capacity[2] -= partialPaper - capacity[0];
        //     if(capacity[1] + capacity[2] < partialPlastic) possible = false; 
        //     //System.out.println("RESULT: ");
        //     if(possible) System.out.println("YES");
        //     else System.out.println("NO");
        // }

        for(int zz=0; zz<css; zz++){
            int[] capacity = new int[3];
            int[] waste = new int[5];
            for(int p=0; p<3; p++) capacity[p] = sObj.nextInt();
            for(int q=0; q<5; q++) waste[q] = sObj.nextInt();
            capacity[0] -= waste[0];
            capacity[1] -= waste[1];
            capacity[2] -= waste[2];

            if(capacity[0] > 0){
                waste[3] -= capacity[0];
            }
            if(waste[3] > 0){
                capacity[2] -= waste[3];
            }

            if(capacity[1] > 0){
                waste[4] -= capacity[1];
            }
            if(waste[4] > 0){
                capacity[2] -= waste[4];
            }

            if(capacity[0]<0 ||capacity[1]<0 || capacity[2]<0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}