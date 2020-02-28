/* Given a non-empty array of integers, every element appears twice except for one. Find that single one. */

class FindUnique{
    int getUnique(int[] arr){
        int xSum = 0;
        for(int elem: arr){
            xSum ^= elem;
        }
        return xSum;
    }
}

class Solution{
    public static void main(String[] args){
        int[] arr = {1, 4, 1, 42, 4};
        FindUnique obj = new FindUnique();
        System.out.print("Unique no is: " + obj.getUnique(arr));
    }
}