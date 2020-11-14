// Problem: https://codeforces.com/problemset/problem/1445/A

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ArrayRearrange{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int size = sObj.nextInt();
            int n = sObj.nextInt();
            Integer[] a = new Integer[size];
            Integer[] b = new Integer[size];
            for(int i=0; i<size; i++) a[i] = sObj.nextInt();
            for(int j=0; j<size; j++) b[j] = sObj.nextInt();
            Arrays.sort(a);
            Arrays.sort(b, Collections.reverseOrder());
            boolean isCorrect = true;
            for(int k=0; k<size; k++){
                if(a[k] + b[k] > n){
                    isCorrect = false;
                    break;
                }
            }
            if(isCorrect) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}