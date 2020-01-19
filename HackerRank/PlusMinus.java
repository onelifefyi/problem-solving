class PlusMinus{

    static void findFraction(int[] arr){
        float positive=0;
        float negative=0;
        float zero=0;
        float len = arr.length;

        for(int i =0; i<arr.length; i++){
            if(arr[i]<0){
                negative++;
            }
            else if(arr[i]==0){
                zero++;
            }
            else{
                positive++;
            }
        }

            System.out.println("Pos, Neg, Zero: " + positive/len + negative/len + zero/len);
    }

    public static void main(String[] args){
        int[]  arr = {-3, -14, 0, 61, 64, 75};
        findFraction(arr);
    }
}