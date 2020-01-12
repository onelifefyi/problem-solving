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

    public static void main(String args[]){
        String txt = "Helo";
        System.out.println(isUnique(txt));
    }
}
