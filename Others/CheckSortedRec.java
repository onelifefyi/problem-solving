public class CheckSortedRec{

//   static int x=1;
    static boolean isSorted(int[] arr, int current){
//       System.out.println("Call #"+ x++ +"/t curr: "+ current);
//      Case 1: Only element/last element
        if(current==arr.length-1){
            return true;
        }
//      Case 2:  Generic case
        if(arr[current]<=arr[current+1]){    
//            Was having stack overflow b'cos of this; 
//            Tried checking everywhere couldn't find anything causing problem;
//            Finally used print statements to check curr value then finally solved it :)            
 //           return isSorted(arr, current++);
            return isSorted(arr, ++current);
        }
        else return false;
    }

    public static void main(String[] args){
        int arr[] = {3, 4, 5};
        System.out.println(isSorted(arr, 0));
    }
}