//Problem 2: Given two strings, write a method to decide if one is a permutation of the other.
// sol:
/*
    Eg apex - xpea or aba - baa
    1) For each character iterate and change that char value O(N^2)
    2) Sort both the string, then compare it 1:1 O(NlogN) sorting
    3) Put each char of s1 on hash map with frequency + check for each character from s2 if it exists
       or not O(N) + O(N) = O(N) time but more space (Implemented below)
 */
import java.util.Scanner;
import java.util.HashMap;
public class ChangedPermutation{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
        char[] s1 = sObj.nextLine().toCharArray();
        char[] s2 = sObj.nextLine().toCharArray();

        if(s1.length != s2.length){
            System.out.println("Not a Permutation");
            return;
        }

        for(char ch: s1){
            if(hMap.containsKey(ch)){
                hMap.put(ch, hMap.get(ch) + 1);
            }
            else{
                hMap.put(ch, 1);
            }
        }
        for(char ch: s2){
            if(hMap.containsKey(ch)){
                if(hMap.get(ch) == 0){
                    System.out.println("Not a Permutation");
                    return;
                }
                hMap.put(ch, hMap.get(ch)-1);
            }
            else{
                System.out.println("Not a Permutation");
                return;
            }
        }
        System.out.println("It's a permutation");
    }
}