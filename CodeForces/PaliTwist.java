//problem: https://codeforces.com/problemset/problem/1027/A

// import java.util.Scanner;
// import java.lang.Math;
// public class PaliTwist{
//     public static void main(String[] args){
//         Scanner sObj = new Scanner(System.in);
//         int cases = sObj.nextInt();
//         for(int i=0; i<cases; i++){
//             int size = Integer.parseInt(sObj.nextLine());
//             char[] arr = sObj.nextLine().toCharArray();
//             int[] arrI = new int[size];
//             for(int z=0; z<size; z++){
//                 arrI[z] = (int) (arr[i]%26);
//             }
//             for(int x=0; x<size/2; x++){
//                 y = size - 1 - x;
//                 if(Math.abs(arr[x] - arr[y]) <= 3 && )
//             }
//         }
//     }
// }

import java.util.Scanner;
import java.lang.Math;
public class PaliTwist{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = Integer.parseInt(sObj.nextLine());
        for(int i=0; i<cases; i++){
            int size = Integer.parseInt(sObj.nextLine());
            int arr[] = new int[size];
            int p=0;
            for(char ch : sObj.nextLine().toCharArray()){
                arr[p++] = (ch - 97)% 26;
                //System.out.print(arr[p-1] + " ");
            }
            Boolean result = true;
            for(int z=0; z<size/2; z++){
                //System.out.println("checking " + arr[z] + " and " + arr[size-z-1]);
                // if(arr[z] == 0 && arr[size-1-z] == 24){
                //     continue;
                // }
                // if(arr[z] == 24 && arr[size-1-z] == 0){
                //     continue;
                // }
                // if(arr[z] == 25 && arr[size-1-z] == 1){
                //     continue;
                // }
                // if(arr[z] == 1 && arr[size-1-z] == 25){
                //     continue;
                // }
                if(!((Math.abs(arr[z] - arr[size-1-z]) == 0) || (Math.abs(arr[z] - arr[size-1-z]) == 2))){
                    result = false;
                    break;
                }
            }
            if(result){
                System.out.println("YES");
            }           
            else{
                System.out.println("NO");
            }
        }
    }
}