/* Given an array of integers, find if the array contains any duplicates.
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct. */

import java.util.HashMap;

class ContainsDuplicate{
    boolean checkDuplicate(int[] arr){
        HashMap<Integer, Boolean> hMap = new HashMap<>();
        //hMap.put(14, true);
        //System.out.println(hMap);
        for(int ele: arr){
            if(hMap.containsKey(ele)){
                return true;
            }
            hMap.put(ele, true);
        }
        return false;
    }
}

class Solution{
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 61};
        ContainsDuplicate obj = new ContainsDuplicate();
        boolean result = obj.checkDuplicate(arr);
        System.out.print("Duplicate exists? " + result);
    }
}

