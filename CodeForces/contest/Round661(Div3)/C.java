// problem: https://codeforces.com/contest/1399/problem/C

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
// Not Accepted
// updated

// public class C{
//     public static void main(String[] args){
//         Scanner sObj = new Scanner(System.in);
//         int n = sObj.nextInt();
//         for(int z=0; z<n; z++){
//             int size = sObj.nextInt();
//             int temp = 0;
//             HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
//             for(int i=0; i<size; i++){
//                 int ele = sObj.nextInt();
//                 temp = ele;
//                 if(freqMap.containsKey(ele)) freqMap.put(ele, freqMap.get(ele) + 1);
//                 else freqMap.put(ele, 1);
//             }
//             System.out.println("map: " + freqMap);
//             int maxFreq = temp;
//             int maxFreq2 = temp;
//             for(int key: freqMap.keySet()){
//                 if(freqMap.get(maxFreq) < freqMap.get(key)){
//                     maxFreq2 = maxFreq;
//                     maxFreq = key;
//                 }
//                 else if(freqMap.get(maxFreq2) < freqMap.get(key)) maxFreq2 = key;
//             }
//             System.out.println(Math.max(freqMap.get(maxFreq)/2, Math.min(freqMap.get(maxFreq),freqMap.get(maxFreq2))));
//         }
//     }
// }

public class C{
    public static int getMax(int totalWeight, int[] input, int maxGlobal){
        int left = 0;
        int right = input.length - 1;
        int max = 0;
        while(left < right){
            if(input[left] + input[right] == totalWeight){
                //System.out.println(input[left] + " " + input[right]);
                max++;
                left++;
                right--;
            }
            else if(input[left] + input[right] < totalWeight) left++;
            else right--;
        }
        if(maxGlobal < max) return max;
        else return maxGlobal;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        for(int z=0; z<n; z++){
            int size = sObj.nextInt();
            int[] input = new int[size];
            for(int zz=0; zz<size; zz++) input[zz] = sObj.nextInt();
            int max = 0;
            Arrays.sort(input);
            for(int i=2; i<101; i++){
                max = getMax(i, input, max);
                //System.out.println("count: " + i);
            }
            System.out.println(max);
        }
    }
}