import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = Integer.parseInt(sObj.nextLine());
        for(int z=0; z<nos; z++){
            char[] arr = sObj.nextLine().toCharArray();
            System.out.print(arr[0]);
            for(int i=1; i<arr.length - 1; i += 2){
                System.out.print(arr[i]);
            }
            System.out.println(arr[arr.length-1]);
        }
    }
}