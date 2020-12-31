// Problem: https://codeforces.com/contest/1466/problem/B

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int size = sObj.nextInt();
            int[] input = new int[size];
            for(int i=0; i<size; i++) input[i] = sObj.nextInt();
            Arrays.sort(input);
            HashSet<Integer> hSet = new HashSet<Integer>();
            hSet.add(input[0]);
            // for(int j=1; j<size; j++){
            //     if(input[j-1] == input[j]) input[j]++;
            //     hSet.add(input[j]);
            // }
            for(int j=1; j<size; j++) hSet.add(hSet.contains(input[j])?input[j]+1:input[j]);
            System.out.println(hSet.size());
        }
    }
}