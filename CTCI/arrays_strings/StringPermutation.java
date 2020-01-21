class StringPermutation {

    static boolean checkPer(String s1, String s2){
        if(s1.length() != s2.length()){
            return  false;
        }
        Boolean result = true;
        int[] arr = new int[26];
        for(int i=0; i<s1.length(); i++){
            arr[s1.charAt(i) - 'a'] += 1;
        }
        for(int j=0; j<s2.length(); j++){
            if(arr[s2.charAt(j) - 'a'] == 0){
                return  false;
            }
            arr[s2.charAt(j) - 'a'] -= 1;
        }
        return result;
    }
    public static void main(String[] args) {
        String s1 = "zabcdalf";
        String s2 = "cbfzaad";
        System.out.println(checkPer(s1, s2));
    }
}