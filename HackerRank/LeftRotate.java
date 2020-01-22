class LeftRotate{

    static int[] shift(int[] arr, int noShift){
        int temp = 0;
        for(int i=0; i<noShift; i++){
            temp = arr[0];
            for(int j=0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3, 14, 17, 61, 64, 75};
        int[] res = shift(arr, 3);
        for(int num: res){
            System.out.print(num+ " ");
        }
    }
}