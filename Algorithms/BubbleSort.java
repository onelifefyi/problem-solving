class BubbleSort{
    void sort(int[] arr){
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

class Solution{
    public static void main(String[] args){
        int arr[] = {12, 215, 432, 5, 32, 46, 23, 6 };
        BubbleSort obj = new BubbleSort();
        obj.sort(arr);
        for(int ele: arr){
            System.out.println(ele);
        }
    }
}