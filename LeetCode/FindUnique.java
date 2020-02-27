/* Given a non-empty array of integers, every element appears twice except for one. Find that single one element. */

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
        FindUnique obj = new FindUnique(arr);
        System.out.print("Unique no is: " + getUnique());
    }
}
