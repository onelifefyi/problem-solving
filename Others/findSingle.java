// Find the element that appears once in an array where every other element appears twice.


public class findSingle{
	public static int solution(int arr[]){
		int num = arr[0];
		for(int i=1; i<arr.length; i++){
			num = num^arr[i];		// XOR operator (^)
		}
		return num;
	}

	public static void main(String args[]){
		int[] arr = {1, 2, 4, 1, 61, 4, 2};
		System.out.println("Single number is : " + solution(arr));
	}
}
