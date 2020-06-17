public class MergeSortedArray{
    public static void main(String[] args){
        int[] arr1 = {1, 23, 13523, 23643};
        int l1 = arr1.length;
        int[] arr2 = {2,24,13555, 13556};
        int l2 = arr2.length;
        int lr = arr1.length + arr2.length;
        int[] result = new int[lr];

        int i, j, k;
        i = j = k = 0;

        while(i<l1 && j<l2){
            if(arr1[i] < arr2[j]){
                result[k++] = arr1[i++];
            }
            else{
                result[k++] = arr2[j++];
            }
        }

        while(i<l1){
            result[k++] = arr1[i++];
        }
        while(j<l2){
            result[k++] = arr2[j++];
        }

        System.out.println("Result: ");
        for(int ele: result){
            System.out.print(ele + " ");
        }
    }
}