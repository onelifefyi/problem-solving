//problem: https://codeforces.com/problemset/problem/1312/A

import java.util.Scanner;
public class TwoPoly{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = Integer.parseInt(sObj.nextLine());
        for(int i=0; i<cases; i++){
            if(sObj.nextInt() % sObj.nextInt() == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            sObj.nextLine();
        }
    }
}