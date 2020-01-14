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
        boolean result = true;
        HashMap hmap = new HashMap();
        for(int i=0; i<txt.length(); i++){
            if(hmap.containsKey(txt.charAt(i))){
                hmap.put(txt.charAt(i),(int) hmap.get(txt.charAt(i)) + 1);
            }
            System.out.println((String) hmap.get('l'));
        }
        return result;
    }

    public static void main(String args[]){
        String txt = "Hello";
        System.out.println(isUniqueImproved(txt));
    }
}
