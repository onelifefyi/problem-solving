// Problem: https://codeforces.com/problemset/problem/721/A
import java.util.Scanner;

public class Japanese{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        char[] arr = sObj.nextLine().toCharArray();
        int total = 0;
        StringBuilder sOut = new StringBuilder();
        int start = 0;
        int i = 0;
        while(i<n){
            if(arr[i] == 'B'){
                start = i;
                total++;
                while(i < n){
                    if(arr[i] != 'B') break;
                    i++;
                }
                sOut.append(i-start);
                sOut.append(' ');
            }
            else i++;
        }
        System.out.println(total);
        System.out.println(sOut);
    }
}