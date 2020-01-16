class SubArraySum{

    static void iterativeMethod(int[] arr){
        int sum=0;
        int end=0;
        for(int i=0; i<arr.length; i++){
            sum=arr[i];
            if(sum == 0){
                System.out.println("Start: " +i+ " End: " +i);
                }
            for(int j=i+1; j<arr.length; j++){
                sum += arr[j];
                //System.out.println(sum);
                if(sum == 0){
                System.out.println("Start: " +i+ " End: " +j);
                }
            }    
        }
    }

    static void preComputationMethod(int[] arr){

    }

    public static void main(String[] args){
        int[] arr = {0, -3, 14, 61, -75, 89, 0};
        iterativeMethod(arr);
        preComputationMethod(arr);
    }
}