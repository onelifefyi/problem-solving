class AppendByOne{
    int[] getAppended(int[] arr){
        return arr;
    }
}

class Solution{
    public static void main(String[] args){
        AppendByOne obj = new AppendByOne();
        int[] arr = {1,2,3};
        System.out.println(obj.getAppended(arr));
    }
}