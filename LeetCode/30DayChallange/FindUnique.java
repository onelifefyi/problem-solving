import java.util.Scanner;
class FindUnique{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String[] input = sObj.nextLine().split(" ");
        int result = 0;
        for(String ele: input){
            result ^= Integer.parseInt(ele);
        }
        System.out.println(result);
    }
}