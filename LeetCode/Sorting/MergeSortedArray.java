// Problem: https://leetcode.com/explore/featured/card/top-interview-questions-easy/96/sorting-and-searching/587/
//          - Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

class MergeSortedArray{

        static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m+n-1;
        m--;n--;
        while(m>=0 && n>=0){
            //System.out.println("m,n = " + m + ", " + n);
            if(nums2[n] > nums1[m]) nums1[last] = nums2[n--];
            else nums1[last] = nums1[m--];
            last--;
        }
        while(m>=0) nums1[last--] = nums1[m--];
        while(n>=0) nums1[last--] = nums2[n--];
        for(int ele: nums1) System.out.print(ele + " ");
    }

    public static void main(String[] arsg){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}