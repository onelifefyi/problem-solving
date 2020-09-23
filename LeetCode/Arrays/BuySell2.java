// problem: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
/* Approach: The only way to gain profit is by buying on lower cost, 
             so buy a stock everytime we see that price on next day is higher and sell it the next day
             O(N) time, O(1) space
 */
import java.util.Scanner;
public class BuySell2{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int[] nums = new int[n];
        for(int zz=0; zz<n; zz++) nums[zz] = sObj.nextInt();
        int profit = 0;
        for(int i=1; i<n; i++) if(nums[i] > nums[i-1]) profit += nums[i]-nums[i-1];
        System.out.println(profit);
        sObj.close();
    }
}