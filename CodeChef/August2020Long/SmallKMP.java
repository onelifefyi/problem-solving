// problem: https://www.codechef.com/AUG20B/problems/SKMP
// I'm getting correct output here, IDK why it isn't getting accepted in CodeChef. (Need to check!)
// Update: I was wrong about the lexicographically smallest part eg for zzzzza za as input my o/p was zzzzza,
// whereas o/p should be zazzzz
// fixed that IDK still what's wrong!!!

import java.util.Scanner;
import java.util.Arrays;
class SmallKMP{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        sObj.nextLine();
        for(int z=0; z<css; z++){
            StringBuilder sbOut = new StringBuilder();
            String input = sObj.nextLine();
            String substr = sObj.nextLine();
            int[] freq = new int[26];
            Arrays.fill(freq,0);
            for(char ch: input.toCharArray()) freq[ch-97] += 1;
            for(char ch2: substr.toCharArray()) freq[ch2-97] -= 1;
            int firstChr = substr.charAt(0) - 97;
            boolean added = false;
            boolean smallest = false;
            for(int h=1; h<substr.length(); h++){
                if(substr.charAt(0) > substr.charAt(h)){
                    smallest = true;
                    break;
                }
            }
            for(int i=0; i<26; i++){
                if(firstChr == i && smallest){
                    sbOut.append(substr);
                    smallest = false;
                    added = true;
                }
                if(!added && firstChr < i){
                    sbOut.append(substr);
                    added = true;
                }
                if(freq[i] > 0){
                    while(freq[i] != 0){
                        sbOut.append((char)(i+97));
                        freq[i] -= 1;
                    }
                }
            }
            if(!added) sbOut.append(substr);
            System.out.println(sbOut.toString());
        }
    }
}
