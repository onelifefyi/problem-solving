// My initial implementation of Binary Search

public class BinarySearch{
	
	public static int search(int[] arr, int elementToFind){
		int start = 0;	
		int end = arr.length-1;
		int indexOfElement=-1;
		int mid=0;
		while(start<end){
			mid = (start+end)/2;
			if(arr[mid]==elementToFind){
				indexOfElement=mid;
				break;
			}
			if(arr[mid]<elementToFind){
				start=mid+1;
			}
			else{
				end=mid;
			}
		}
		if(arr[start]==elementToFind){
			indexOfElement=start;
		}	
		return indexOfElement;
	}

	public static void main(String[] args){
		int arr[] = {61};	//Sorted array input
		int elementToFind = 64;
		int indexOfElement = search(arr, elementToFind);
		System.out.println("Index of " + elementToFind + " is: " + indexOfElement);
	}
}
