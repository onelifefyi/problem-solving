//problem: https://practice.geeksforgeeks.org/problems/series-ap/0

import java.util.Scanner;
public class AP{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int a = sObj.nextInt();
        int d = sObj.nextInt() - a;
        for(int i=1; i<=n; i++){
            System.out.print((a + (i-1)*d) + " ");
        }
    }
}