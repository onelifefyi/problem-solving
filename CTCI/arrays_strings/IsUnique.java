import java.util.HashMap;

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

    public static void main(String args[]){
        String txt = "Helo";
        System.out.println(isUniqueImproved(txt));
    }
}
