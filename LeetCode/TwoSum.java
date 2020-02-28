/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice. */

class TwoSum{
    int[] getTwo(int[] arr, int target){
        int[] indexArr = new int[2];
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    indexArr[0] = i;
                    indexArr[1] = j;
                    return indexArr;
                }
            }
        }
        return indexArr;
    }
}

class Solution{
    public static void main(String[] args){
        int[] arr = {1, 21, 0, 0, 8, 7};
        TwoSum obj = new TwoSum();
        System.out.println("The two elements are: " );
        for(int i=0; i<2; i++){
            System.out.print(arr[obj.getTwo(arr, 9)[i]] + " ");
        }
    }
}