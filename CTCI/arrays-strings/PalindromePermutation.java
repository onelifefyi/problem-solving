//problem: 
/* Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat". "atco cta". etc.)  */

// approach:
// 1) Extreme brute find all permutation O(N!) ugly!!
// We can count the frequency of each character, if it's all even then palindrome,
// else there can be only 1 odd number (for the case of odd # of characters) O(N) implemented

// 2) we can use bit vectors to store either character even or odd by continuesly setting and clearing
// each time a character apper in size of int 32 bit; I gotta learn more about that, it'll save alot of space

import java.util.Scanner;
import java.util.HashMap;
public class PalindromePermutation{

    static boolean isPD(String s){
        HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
        char[] cArr = s.toCharArray();
        int size = 0;
        for(char ch: cArr){         // O(N)
            if(ch != ' '){
                size++;
                if(hMap.get(ch) != null) hMap.put(ch, hMap.get(ch) + 1);
                else hMap.put(ch, 1);
            }
        }
        int oddCount = 0;
        for(int ele: hMap.values()){        //O(N)
            if(ele % 2 != 0) oddCount++;
            if(oddCount >1) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String input = sObj.nextLine();
        System.out.println(isPD(input));
    }
}