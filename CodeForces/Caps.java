//problem: https://codeforces.com/problemset/problem/131/A

// import java.util.Scanner;

// public class Caps{
//     public static void main(String[] args){
//         Scanner sObj = new Scanner(System.in);
//         char arr[] = sObj.nextLine().toCharArray();
//         Boolean all_caps = true;
//         Boolean all_lower = false;
//         for(int i=1; i<arr.length; i++){
//             if(arr[i]>90){
//                 all_caps = false;
//             }
//             if(arr[i] <=90){
//                 all_lower = false;
//             }
//         }
//         if(arr[0] >= 97 && all_caps && all_lower){
//             System.out.print((char) (arr[0] - 32));
//         }
//         else{
//             System.out.print(arr[0]);
//         }
//         if(all_caps){
//             for(int z=1; z<arr.length; z++){
//                 System.out.print((char) (arr[z] + 32));
//             }
//         }
//         else{
//             for(int z=1; z<arr.length; z++){
//                 System.out.print(arr[z]);
//             }
//         }
//     }
// }

import java.util.Scanner;

public class Caps{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        char arr[] = sObj.nextLine().toCharArray();
        Boolean all_caps = true;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > 90){
                all_caps = false;
                break;
            }
        }
        if(all_caps){
            if(arr[0] > 90){
                System.out.print((char) (arr[0] - 32));
                for(int z=1; z<arr.length; z++){
                    System.out.print((char) (arr[z]+32));
                }
            }
            else{
                for(char ele: arr){
                    System.out.print((char) (ele + 32));
                }
            }
        }
        else{
            for(char ele: arr){
                System.out.print((char) (ele));
            }
        }
    }
}