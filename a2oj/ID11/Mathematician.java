// problem #12: https://codeforces.com/problemset/problem/61/A

// This was an epic way to solve this problem, but damn the input. A bit disappointed in CF
// import java.util.Scanner;
// public class Mathematician{
//     public static void main(String[] args){
//         Scanner sObj = new Scanner(System.in);
//         StringBuilder sOut = new StringBuilder();
//         String s1 = sObj.nextLine();
//         String s2 = sObj.nextLine();
//         //System.out.println(Integer.toBinaryString(61));
//         String result = Long.toBinaryString((Long.parseLong(s1,2) ^ (Long.parseLong(s2,2))));
//         int length = s1.length() - result.length();
//         for(int i=0; i<length; i++) sOut.append('0');
//         System.out.println(sOut + result);
//     }
// }

import java.util.Scanner;
public class Mathematician{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        StringBuilder sOut = new StringBuilder();
        char[] s1 = sObj.nextLine().toCharArray();
        char[] s2 = sObj.nextLine().toCharArray();
        for(int i=0; i<s1.length; i++)
            sOut.append(s1[i] ^ s2[i]);        
        System.out.println(sOut);
    }
}