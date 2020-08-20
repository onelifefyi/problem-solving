// Problem: https://www.codechef.com/problems/COVID19
// Approach: At first I was taking two vars max and min and was trying to find out both in single go,
//           There was a lot of thinsg to be added and IDK somehow it was messed up
//           + After looking at the editorial, I found an elegentway; use an array to keep difference between each elements of input array
//             then iterate through the difference array! It's pretty much the same but makes it easy to understand!

// import java.util.Scanner;
// import java.util.ArrayList;

// class Covid{
//     public static void main(String[] args){
//         Scanner sObj = new Scanner(System.in);
//         int css = sObj.nextInt();
//         for(int zz=0; zz<css; zz++){
//             int n = sObj.nextInt();
//             int input[] = new int[n];
//             int count=0;
//             int max=0;
//             boolean disconnect = false;
//             int min=Integer.MAX_VALUE;
//             for(int i=0; i<n; i++) input[i] = sObj.nextInt();
//             for(int x=1; x<n; x++){
//                 if(input[x] - input[x-1] <= 2) count++;
//                 else{
//                     if(!disconnect){
//                         min = max = count;
//                         disconnect = true;
//                     }
//                     else{
//                         if(count > max) max = count;
//                         if(count < min) min = count; 
//                     }
//                     count = 0;
//                 }
//             }
//             if(max < count) max = count+1;
//             else max++;
//             if(min == Integer.MAX_VALUE) min = max;
//             else min++;
//             System.out.println(min + " " + max);
//         }
//     }
// }

import java.util.Scanner;
import java.util.ArrayList;

class Covid{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int n = sObj.nextInt();
            int input[] = new int[n];
            int diff[] = new int[n];
            int count=1;
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i=0; i<n; i++) input[i] = sObj.nextInt();
            for(int j=1; j<n; j++) diff[j] = input[j] - input[j-1];

            for(int x=1; x<n; x++){
                if(diff[x] <= 2) count++;
                else{
                    max = Math.max(max, count);
                    min = Math.min(min, count);
                    count = 1;
                }
            }
            max = Math.max(max, count);
            min = Math.min(min, count);
            System.out.println(min + " " + max);
        }
    }
}