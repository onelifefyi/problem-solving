//problem: https://codeforces.com/problemset/problem/1197/A

// import java.util.Arrays;
// import java.util.Scanner;
// import java.lang.Math;

// NOT EFFICIENT
// public class Planks{
//     public static void main(String[] args){
//         Scanner sObj = new Scanner(System.in);
//         int nos = sObj.nextInt();
//         for(int z=0; z<nos; z++){
//             int size = sObj.nextInt();
//             int[] arr = new int[size];
//             for(int i=0; i<size; i++){
//                 arr[i] = sObj.nextInt();
//             }
//             if(size < 3){
//                 System.out.println(0);
//                 continue;
//             }
//             Arrays.sort(arr);
//             System.out.println(Math.min(arr[size-2]-1, size-2));
//         }
//     }
// }


// EFFICIENT
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Planks{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int z=0; z<nos; z++){
            int first, second;
            first = second = Integer.MIN_VALUE;
            int size = sObj.nextInt();
            int[] arr = new int[size];
            for(int i=0; i<size; i++){
                arr[i] = sObj.nextInt();
                if(arr[i] >= first){
                    second = first;
                    first = arr[i];
                }
                else if(arr[i] > second && arr[i] != first){
                second = arr[i]; 
                }
            }
            //System.out.println("max: " + first + " 2nd max :" + second);
            if(size < 3){
                System.out.println(0);
                continue;
            }
            System.out.println(Math.min(second-1, size-2));
        }
    }
}