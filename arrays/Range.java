// Find the range of given array O(n)
public class Range {
    public static void main(String[] args) {
        int[] arr = {-1,2,6,-5745,-765,56,8,61,-457,-856};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int ele: arr){
            if(ele < min) min = ele;
            if(ele > max) max = ele;
        }
        System.out.println("Range: " + (max - min));
    }
}
