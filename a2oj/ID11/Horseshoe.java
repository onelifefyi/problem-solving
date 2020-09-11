// problem #21: https://codeforces.com/problemset/problem/228/A

import java.util.Scanner;
import java.util.HashSet;
public class Horseshoe{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        HashSet<String> hSet = new HashSet<String>();
        for(String ch: sObj.nextLine().split(" ")) hSet.add(ch);
        System.out.println(4-hSet.size()); 
        sObj.close();
    }
}