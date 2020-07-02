//problem: 
/* There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away. */

// implementation: O(N)

import java.util.Scanner;
public class OneAway{

    public static boolean replace(char[] s1, char[] s2){
        int diffCount = 0;
        for(int i=0; i<s1.length; i++){
            if(s1[i] != s2[i]){
                diffCount++;
            }
            if(diffCount > 1){
                return false;
            }
        }
        return true;
    }

    public static boolean modifyLen(char[] small, char[] large){
        int index1, index2;
        index1 = index2 = 0;
        while(index1 < small.length && index2 < large.length){
            if(small[index1] != large[index2]){
                if(index1 != index2) return false;
                index2++;
            }
            else{
                index1++; index2++;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        char[] s1 = sObj.nextLine().toCharArray();
        char[] s2 = sObj.nextLine().toCharArray();

        if(s1.length == s2.length){
            System.out.println(replace(s1, s2));
        }
        else{
            if(s1.length + 1 == s2.length) System.out.println(modifyLen(s1, s2));
            else if(s1.length == s2.length + 1) System.out.println(modifyLen(s2, s1));
        }
    }
}