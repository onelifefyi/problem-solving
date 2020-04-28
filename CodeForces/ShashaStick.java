//problem: https://codeforces.com/problemset/problem/832/A

import java.util.Scanner;

public class ShashaStick{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        long lines = sObj.nextLong();
        long power = sObj.nextLong();
        long result = lines / power;
        if(result % 2 == 0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}