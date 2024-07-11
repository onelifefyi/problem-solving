import java.util.*;
import java.util.HashMap;
class LongestNonRepeatingSubStr{

    static int getLength(String s){
        int start = 0;
        int result = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i)) && start <= hm.get(s.charAt(i)){
                start = hm.get(s.charAt(i)) + 1;
            }
            else{
                result = Math.max(result, i - start + 1);
            }
            hm.put(s.charAt(i), i);
        }
        return result;
    }

    public static void main(String []args){
        String s = "abcabcbb";
        System.out.println(LongestNonRepeatingSubStr.getLength(s));
    }
}