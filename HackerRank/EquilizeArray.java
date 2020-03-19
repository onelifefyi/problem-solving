// Find the minimum deletion steps required such that the resulting array has same elements

class Solution{
    int getMinDel(int[] arr){
        int[] count = new int[101];
        for(int ele: arr){
            count[ele] += 1;
        }
        int max = 0;
        for(int ele: arr){
            if(count[ele]>max){
                max = count[ele];
            }
        }
        return arr.length - max;
    }
}

class EqualizeArray{
    public static void main(String[] args){
        Solution obj = new Solution();
        int[] arr = {1,23, 24,21,4,24, 4, 4};
        System.out.println("Minimum deletion required is: " + obj.getMinDel(arr));
    }
}