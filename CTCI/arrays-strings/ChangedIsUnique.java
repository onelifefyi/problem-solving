// Problem 1
import java.util.HashMap;
//import java.util.BitSet;

class IsUnique{

    static boolean isUnique(String txt){            // O(N^2)
        char chr;
        boolean result = true;
        for(int i=0; i<txt.length(); i++){
            chr = txt.charAt(i);
            for(int j=i+1; j<txt.length(); j++){
                if(chr == txt.charAt(j)){
                    result = false;
                }
            }
 //           System.out.print(txt.charAt(i));
        }
        return result;
    }

//Using Hash Map
    static boolean isUniqueImproved(String txt){
        HashMap mapH = new HashMap();               
        for(int i=0; i<txt.length(); i++){              //O(N)
            if(mapH.containsKey(txt.charAt(i))){
                return false;
            }
            else{
                mapH.put(txt.charAt(i), 1);
            }
        }
        return true;
    }

    static boolean isUniqueImproved2(String txt){
        boolean[] bArr = new boolean[26];
        for(char c: txt.toCharArray()){      //O(N), Not really improvement, just another approach
 //           System.out.println(c);
            if(bArr[c-'a']){
                return false;
            }
            else{
                bArr[c-'a'] = true;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String txt = "helo";
        System.out.println("Iteratively: " + isUnique(txt));
        System.out.println("Using Hash Map: " + isUniqueImproved(txt));
        System.out.println("Using Boolean array: " + isUniqueImproved2(txt) );
    }
}
