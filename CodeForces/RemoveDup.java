//problem: https://codeforces.com/contest/978/problem/A
// NOOOOOOTTTTTTTTTTTT SOLVVVVEEEEEDDDDDD
// Try again

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDup{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        HashSet<String> hSet = new HashSet<String>();
        //Iterator iObj = hSet.iterator();
        int n = Integer.parseInt(sObj.nextLine());
        String[] input = sObj.nextLine().split(" ");
        for(String ele: input){
            hSet.add(ele);
        }
        System.out.println(hSet.size());
         for(int i=hSet.size()-1; i>=0; i = i){
             if(hSet.contains(input[i])){
                 System.out.print(input[i] + " ");

             }
         }
    }
}