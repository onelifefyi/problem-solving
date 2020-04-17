import java.util.Scanner;

public class RecMax{
    public static int greatest = Integer.MIN_VALUE;

    public static int findMax(String[] arr, int n){
        //System.out.println("n: " + n);
        if(n == -1){
            return greatest;
        }
        else if(greatest < Integer.parseInt(arr[n])){
            greatest = Integer.parseInt(arr[n]);
        }
        return RecMax.findMax(arr, --n);
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String[] inputArr = sObj.nextLine().split(" ");
        System.out.println(findMax(inputArr, inputArr.length - 1));
    }
}