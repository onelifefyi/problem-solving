//problem: https://www.codechef.com/MAY20B/problems/CORUS

import java.util.Scanner;
import java.util.Arrays;

class Isolation{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int n = sObj.nextInt();
            int q = sObj.nextInt();
            sObj.nextLine();
            int[] freq = new int[26];
            Arrays.fill(freq, 0);
            for(char ch: sObj.nextLine().toCharArray()){
                freq[ch-'a'] += 1;
            }
            for(int i=0; i<q; i++){
                int limit = sObj.nextInt();
                int count = 0;
                for(int ele: freq) if(ele > limit) count += ele - limit;
                System.out.println(count);
            }
        }
    }
}