/* 
Problem: https://www.geeksforgeeks.org/minimum-number-jumps-reach-endset-2on-solution/
>   Minimum number of jumps to reach end 

Approach: 
>   Traverse the array keeping max reach in mind, and each time hop to the max updating the max reach;
    if max reach reaches end or greater than end of the array return hops;
    for case where element is 0, i.e trapped state return -1, this can be done by checking if local max == globalmax(max reach)
    time O(n) | auxilary space O(1)
*/

class MinJump {
    public static int getJumps(int[] input){
        int hops = 1;
        int globalMax = input[0];
        int i = 1;
        int max = 0;
        while(globalMax < input.length-1){
            //System.out.println("Global Max: " + globalMax);
            if(max == globalMax) return -1;
            max = globalMax;
            for(i = i; i<=max; i++){
                //System.out.println("i: " + i);
                if(i + input[i] > globalMax) globalMax = i + input[i];
                //System.out.println("Global Max: " + globalMax);
                if(globalMax >= input.length - 1) break;
            }
            hops++;
        }
        return hops;
    }

    public static void main(String[] args) {
        //Test Cases/ Edge Cases:

        //int[] input = {1,3,5,2,2,2,6,7,6,8,9};
        //int[] input = {1,4,3,2,6,7};
        //int[] input = {1,3,5,8,9,2,6,7,6,8,9};
        //int[] input = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] input = {1,0,61,24};

        System.out.println(getJumps(input));
    }
}
