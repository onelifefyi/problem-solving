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
        for(int num: arr){
            System.out.print(num+ " ");
        }
        return 61;
    }
    public static void main(String[] args){
        int x = getLast(7, 4, 4);
    }
}