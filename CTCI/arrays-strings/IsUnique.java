import java.util.BitSet;
import java.util.HashMap;
public class IsUnique{
    static boolean unique1(String input){
        HashMap hMap = new HashMap();
        for(char ch: input.toCharArray()){
            if(hMap.containsKey(ch)){
                return false;
            }
            else{
                hMap.put(ch, true);
            }
        }
        return true;
    }

    static boolean unique2(String input){
        BitSet bSet = new BitSet();
        for(char ch: input.toCharArray()){          // O(N) time; O(1) space
            if(bSet.get(ch - 'a')){
                return false;
            }
            else{
                bSet.set(ch - 'a');
            }
        }
        return true;
    }

    public static void main(String[] args){
        String input = "polish";
        // Better time: 
        System.out.println(unique1(input));          // HashMap
        System.out.println(unique2(input));          // Bit Vector

        // Better space: 
        // if no additional DS can be used:
        // 1) We can iterate through the array for each character and compare: O(N^2) time 
        // 2) We can sort the string O(NlogN), the compare neighbour char O(N) => total O(NlogN)
    }
}