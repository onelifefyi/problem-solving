import java.util.Scanner;
class MaxSubArray{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String[] arr = sObj.nextLine().split(" ");
        int totalElements = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<totalElements; i++){
            for(int j=i; j<totalElements; j++){
                //System.out.println("i: " + i + " j: " + j);
                sum += Integer.parseInt(arr[j]);
                if(max < sum){
                    max = sum;
                    //System.out.println("max: " + max + " sum: " + sum);
                }
            }
            sum = 0;
        }
        System.out.println(max);
    }
}