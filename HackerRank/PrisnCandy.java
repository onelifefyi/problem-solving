class PrisnCandy{

    static int getLast(int num_pri, int num_cndy, int start){
        int[] arr = new int[num_pri];
        int counter = 0;
        for(int i=0; i<num_pri; i++){
            if(start<=num_pri){
                arr[i] = start;
                start += 1;
            }
            else{
                arr[i] = ++counter;
            }
        }
//       for(int num: arr){
//          System.out.print(num+ " ");
//     }
        num_cndy %= num_pri;
        return arr[num_cndy]-1;
    }
    public static void main(String[] args){
        System.out.print(getLast(7, 8, 7));
    }
}