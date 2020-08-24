/*
Problem: https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/
         - Given an unsorted array of size n. Array elements are in the range from 1 to n. One number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.

Approach: + Most naive approach would be to first sort the array O(nlogn) and then iterate through it to check for missing and repeating element O(n) : Time O(nlogn)
          + Create a new frequency array of size n and fill it with all 1 (not required, but good), now iterate throught the entire given array and keep subtracting the corrosponding
            value at index of the element in frequency array by 1, if the value is 0, that means it's the duplicate element. Finally iterate throught the array again to find the missing element;
            - Time: O(N + N) = O(N);    space: O(N)
            - We can avoid using extra space by marking elements as negative to mark them as visited (will work for only positive elements which is the given case here)
          + One other way is to create two equations of missing(m) and duplicate(d) element and solve it
            1) ((1 + 2 + 3 + ... + N)-{m}) - (1 + 2 + .... + d + d + ... + N) = X     => d-m = X
            2) ((1^2 + 2^2 + ..... N^2) - {m^2}) - (1^2 + 2^2 + ... + d^2 + d^2 + ... N^2) = Y   => d^2 - m^2 = Y
                Now we can solve both the equation to get d and m
*/

class RepeatMiss{

    static int[] find(int[] arr){
        int[] result = new int[2];
        int n = arr.length;
        int diff;   // expected - given sum
        int diffSqr; // expected^2 - given^2 sum (sum of squares)
        int givenSum = 0;
        int givenSumSqr = 0;
        for(int ele: arr){
            givenSum += ele;
            givenSumSqr += ele * ele;
        } 
        int expectedSum = n*(n+1)/2;
        diff = expectedSum - givenSum;      // = m-d
        int expectedSumSqr = 0;
        for(int i=1; i<=n; i++){
            expectedSumSqr += (int) Math.pow(i, 2);
        }
        diffSqr = expectedSumSqr - givenSumSqr; // = d^2-m^2
        int d = (diffSqr- (int) Math.pow(diff, 2))/(2*diff);        // this requires some pen & paper calculation
        int m = (diff + d);                                             
        result[0] = m;
        result[1] = d;
        return result;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 1};
        int[] result = find(arr);
        System.out.println("Missing: " + result[0] + " Repeating: " + result[1]);
    }

}