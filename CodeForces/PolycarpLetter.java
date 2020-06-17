// problem: https://codeforces.com/problemset/problem/864/B

import java.util.HashSet;
import java.util.Scanner;
public class PolycarpLetter{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        sObj.nextLine();
        char[] arr = new char[nos];
        int i=0;
        int capCount = 0;
        for(char ch: sObj.nextLine().toCharArray()){
            arr[i++] = ch;
            if(arr[i-1] <= 90){
                capCount++;
            }
        }
        if(nos == 1 && capCount == 0){
            System.out.println(1);
            return;
        }
        int positions[] = new int[capCount+2];
        positions[0] = -1;
        if(arr[nos-1] > 90){
            positions[capCount+1] = nos;
        }
        int counter = 1;
        for(int j=0; j<nos; j++){
            if(arr[j] <= 90){
                positions[counter++] = j;
            }
        }
        // for(int ele: positions){
        //     System.out.print(ele + " ");
        // }
        int max = 0;
        HashSet<Character> hSet = new HashSet<Character>();
        for(int z=0; z<positions.length-1; z++){
            hSet.clear();
            for(int c=positions[z]+1; c<positions[z+1]; c++){
                //System.out.println("c: " + c);
                hSet.add(arr[c]);
            }
            if(hSet.size() > max){
                max = hSet.size();
            }
        }
        System.out.println(max);
    }
}