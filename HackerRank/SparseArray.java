/* There is a collection of input strings and a collection of query strings.
 For each query string, determine how many times it occurs in the list of input strings 
*/

class Solution{
    int[] getFreq(String[] strings, String[] queries){
        int[] res = new int[queries.length];
        int counter;
        for(int i=0; i<queries.length; i++){
            counter = 0;
            for(int j=0; j<strings.length; j++){
                if(queries[i]==strings[j]){
                    counter++;
                }
            }
            res[i] = counter;
        }
        return res;
    }
}

class SparseArray{
    public static void main(String[] args){
        String[] strings = {"abc", "def", "av", "bc", "def"};
        String[] queries = {"av", "def", "gif"};
        Solution obj = new Solution();
        int[] res = new int[queries.length];
        res = obj.getFreq(strings, queries);
        for(int ele: res){
            System.out.println(ele);
        }
    }
}
