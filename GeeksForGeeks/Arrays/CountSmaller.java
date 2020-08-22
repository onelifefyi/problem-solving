// problem: https://practice.geeksforgeeks.org/problems/count-of-smaller-elements/0

class CountSmaller{

    static int getSmaller(int[] arr, int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i] > n){
                return i;
            }
        }
        return arr.length;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 4, 24, 523, 641, 4444};
        System.out.println(getSmaller(arr, 24));
    }
}