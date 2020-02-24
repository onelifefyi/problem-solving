class AppendByOne{
    int[] getAppended(int[] arr){
        int flag9last = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]!=9){
                arr[i]++;
                break;
            }
            else{
                arr[i] = 0;
                if(i == 0){
                    flag9last = 1;
                }
            }
        }
        if(flag9last==1){
            int[] newArr = new int[arr.length+1];
            newArr[0] = 1;
            for(int j=0; j<arr.length; j++){
                newArr[j+1] = arr[j];
            }
            return newArr;
        }
        return arr;
    }
}

class Solution{
    public static void main(String[] args){
        AppendByOne obj = new AppendByOne();
        int[] arr = {9,9,9};
        for(int ele: obj.getAppended(arr)){
            System.out.print(ele+ " ");
        }
    }
}