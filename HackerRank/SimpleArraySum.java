// Given an array of integers, find the sum of its elements.

public class SimpleArraySum{
	public static int findSum(int[] arr){
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 61, 14};
		System.out.println("Sum is: " + findSum(arr));
	}
}
