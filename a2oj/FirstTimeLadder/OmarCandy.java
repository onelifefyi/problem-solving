// problem: https://a2oj.com/p?ID=193

import java.util.Scanner;

class OmarCandy{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        sObj.nextLine();
        for(int zz=0; zz<css; zz++){
            int[] arr = new int[26];
            for(char ch: sObj.nextLine().toCharArray()){
                arr[ch - 'a']++;
            }
            int maxVal = 0;
            int maxIndex = 0;
            for(int i=0; i<26; i++){
                if(arr[i] > maxVal){
                    maxVal = arr[i];
                    maxIndex = i;
                }
            }
            System.out.println(maxVal + " " + ((char) (maxIndex + 'a')));
        }
    }
}