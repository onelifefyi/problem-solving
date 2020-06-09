//problem: https://codeforces.com/problemset/problem/798/A
import java.util.Scanner;
public class Palin{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        char[] arr =sObj.nextLine().toCharArray();
        int lastIndex = arr.length - 1;
        Boolean foundOne = false;
        for(int i=0; i<(lastIndex + 1)/2; i++){
            if(arr[i] != arr[lastIndex-i]){
                if(foundOne){
                    System.out.println("NO");
                    return;
                }
                foundOne = true;
            }
        }
        if(foundOne || arr.length % 2 == 1){
        System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}