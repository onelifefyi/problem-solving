/**

1) remainder 
2) Build seating based on starting prisioner arraylist[] = starting to length insert; 0 -> starting
3) return seating[remainder-1]

*/

import java.util.Scanner;
// import java.util.Arraylist;
public class Candy{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);

        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int noPrisoner = sObj.nextInt();
            int noCandies = sObj.nextInt();
            int startPosition = sObj.nextInt();

            int remainder = noCandies % noPrisoner;

            //  6 4 2
            //  9 15 5

            // int[] seating = new int[noPrisoner];
            // 0 1 2 3 4 5 6 7 8
            // 5 6 7 8 9 1 2 3 4

            // int tempStart = startPosition;
            // int currentPosition = 0;
            // for(int i=0; i<=(noPrisoner-startPosition); i++){
            //     seating[i] = tempStart;
            //     tempStart += 1;
            //     currentPosition++;
            // }

            // for(int j=1; j<startPosition; j++){
            //     seating[currentPosition] = j;
            //     currentPosition++;
            // }

            // if(remainder == 0) System.out.println(seating[noPrisoner-1]);
            // else System.out.println(seating[remainder-1]);

            if (startPosition+remainder-1==0 && startPosition > 1) System.out.println(startPosition-1);
            else if(startPosition+remainder-1==0) System.out.println(noPrisoner);
            else System.out.println((startPosition + remainder - 1) % noPrisoner);
        }
    }
}


// remainder
// 6


//  6 4 2
//  9 15 5

// 0 1 2 3 4 5 6 7 8
// 5 6 7 8 9 1 2 3 4


   // 6 -1 = 5
// return (starting + remainder) % noPrisoner;
//        (5 + 6 - 1) % 9 = 1

//        1 + 0 - 1
