/*  */

class RotateArr{
    public void rotate(int[] nums, int k) {
        int temp;
        for(int i = 0; i<k; i++){
            temp = nums[nums.length-1];
            for(int j=nums.length-1; j>0; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }
}

class Solution{
    public static void main(String[] args){
        RotateArr obj = new RotateArr();
        int[] arr = {3, 14, 17, 61, 64, 75};
        for(int ele: obj.rotate(arr, 3)){
            System.out.print(ele + "'");
        }
    }
}