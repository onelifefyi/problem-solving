//problem: https://codeforces.com/problemset/problem/770/A

import java.util.Scanner;
public class Password{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int length = sObj.nextInt();
        int distinct = sObj.nextInt();
        for(int i=0; i<length; i++){
            System.out.print((char) (97 + i%distinct));
        }
    }
}