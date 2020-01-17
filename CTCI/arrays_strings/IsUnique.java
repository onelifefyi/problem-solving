import java.util.HashMap;
import java.util.BitSet;

class IsUnique{

    static boolean isUnique(String txt){
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
        for(int i=0; i<txt.length(); i++){
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
        BitSet bSet = new BitSet(26);
        for(int i=0; i<txt.length(); i++){
            bSet.set(txt.charAt(i)%26);
        }
        System.out.println(bSet.length());
        return true;
    }

    public static void main(String args[]){
        String txt = "hello";
        System.out.println("Iteratively: " + isUniqueImproved(txt));
        System.out.println("Using Hash Map: " + isUniqueImproved(txt));
        System.out.println("Using Bit Vector: " + isUniqueImproved2(txt) );
    }
}
