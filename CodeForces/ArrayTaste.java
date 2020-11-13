// Problem: https://codeforces.com/contest/1438/problem/A
import java.util.Scanner;
public class ArrayTaste{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        for(int i=0; i<n; i++){
            int size = sObj.nextInt();
            for(int j=0; j<size; j++)
                System.out.print(size + " ");
            System.out.println();
        }
    }
}