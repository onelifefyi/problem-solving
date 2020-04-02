//problem: https://codeforces.com/problemset/problem/1220/A

import java.util.Scanner;
public class ShuffledBirthday{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int noChar = Integer.parseInt(sObj.nextLine());
        String input = sObj.nextLine();
        int zero, one;
        zero = one = 0;
        for(char c: input.toCharArray()){
            if(c=='z'){
                zero++;
                continue;
            }
            if(c=='n'){
                one++;
            }
        }
        for(int i=0; i<one; i++){
            System.out.print(1 + " ");
        }
        for(int i=0; i<zero; i++){
            System.out.print(0 + " ");
        }
    }
}