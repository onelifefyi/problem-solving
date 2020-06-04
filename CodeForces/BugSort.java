//problem: https://codeforces.com/problemset/problem/246/A

// import java.util.Scanner;
// public class BugSort{
//     public static void main(String[] args){
//         Scanner sObj = new Scanner(System.in);
//         int arr[] = {4, 3, 2, 1};
//         int temp = 0;
//         for(int i=0; i<arr.length - 1; i++){
//             temp = 0;
//             for(int j=i; j<arr.length - 1; j++){
//                 System.out.println("i: " + i);
//                 if(arr[j] > arr[j+1]){
//                     System.out.println("for i: " + i + " Swapping " + arr[j] + " <-> " + arr[j+1]);
//                     temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         for(int ele: arr){
//             System.out.print(ele + " ");
//         }
//     }
// }

import java.util.Scanner;
public class BugSort{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        if(nos <= 2){
            System.out.println(-1);
        }
        else{
            for(int i=nos; i>0; i--){
                System.out.print(i + " ");
            }
        }
    }
}