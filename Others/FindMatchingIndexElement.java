public class FindMatchingIndexElement{

    static int findMatch(int[] arr){
        int result = -1;
        int arrLen = arr.length;               
        int start = 0;
        int end = arrLen;
        int mid = 0;
        while(end>start){
            mid = (start+end)/2;
            System.out.println(mid);
            if(arr[mid] == mid){
                result = mid;
                break;
            }
            if(arr[mid]>=mid){
                end = mid;
            }
            else {start = mid+1;}
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {-11, -2, 1, 2, 4 };
        System.out.println("Common index/element: " + findMatch(arr));
    }
}