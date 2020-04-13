//problem: https://codeforces.com/problemset/problem/855/A
// This was one weird problem. I was confused that how should I take input and what datastructure to use;


// import java.util.Scanner;
// import java.util.HashSet;
// public class TomRiddle{
//     public static void main(String[] args){
//         Scanner sObj = new Scanner(System.in);
//         HashSet<String> nameSet = new HashSet<String>();
//         int n = Integer.parseInt(sObj.nextLine());
//         for(int i=0; i<n; i++){
//             nameSet.add(sObj.nextLine());
//         }
        
//         for(String ele: names){
//             if(nameSet.contains(ele)){
//                 System.out.println("YES");
//             }
//             else{
//                 System.out.println("NO");
//             }
//         }
//     }
// }

import java.util.HashSet;
import java.util.Scanner;

public class TomRiddle{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        HashSet<String> nameSet = new HashSet<String>();
        int n = Integer.parseInt(sObj.nextLine());
        String name = new String();
        for(int i=0; i<n; i++){
            name = sObj.nextLine();
            if(nameSet.contains(name)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            nameSet.add(name);
        }
    }
}