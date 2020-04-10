import java.util.Scanner;
class MoveZero{
    public static void shift(int[] arr, int shiftIndex){
        for(int i=shiftIndex+1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
    }
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String[] sinput = sObj.nextLine().split(" ");
        int[] input = new int[sinput.length];
        for(int i=0; i<input.length; i++){
            input[i] = Integer.parseInt(sinput[i]);
        }
        int end = input.length;

        for(int i=0; i<end; i++){
            System.out.println("iteration #" + (i+1));
            if(input[i] == 0){
                MoveZero.shift(input, i);
                input[input.length-1] = 0;
                end--;
                if(input[i] == 0){
                    i -=1;
                }
                //System.out.println("changed ele: " + input[i]);
            }
        }
        for(int ele: input){
            System.out.print(ele + " ");
        }
    }
}