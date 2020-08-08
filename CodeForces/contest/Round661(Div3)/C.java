import java.util.Scanner;
import java.util.HashMap;

// Not Accepted

public class C{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        for(int z=0; z<n; z++){
            int size = sObj.nextInt();
            int temp = 0;
            HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
            for(int i=0; i<size; i++){
                int ele = sObj.nextInt();
                temp = ele;
                if(freqMap.containsKey(ele)) freqMap.put(ele, freqMap.get(ele) + 1);
                else freqMap.put(ele, 1);
            }
            System.out.println("map: " + freqMap);
            int maxFreq = temp;
            int maxFreq2 = temp;
            for(int key: freqMap.keySet()){
                if(freqMap.get(maxFreq) < freqMap.get(key)){
                    maxFreq2 = maxFreq;
                    maxFreq = key;
                }
                else if(freqMap.get(maxFreq2) < freqMap.get(key)) maxFreq2 = key;
            }
            System.out.println(Math.max(freqMap.get(maxFreq)/2, Math.min(freqMap.get(maxFreq),freqMap.get(maxFreq2))));
        }
    }
}