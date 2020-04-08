//problem: https://codeforces.com/problemset/problem/344/A
import java.util.Scanner;
public class Magnets{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        char prev = '~';
        int group = 1;
        int elements = Integer.parseInt(sObj.nextLine());
        char[] arr = new char[2];
        for(int i=0; i<elements; i++){
            arr = sObj.nextLine().toCharArray();
            if(arr[0] == prev){
                group++;
                //System.out.println("previous: " + prev);
            }
            prev = arr[1];
        }
        System.out.println(group);
    }
}