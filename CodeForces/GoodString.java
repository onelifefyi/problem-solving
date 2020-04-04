//problem: https://codeforces.com/problemset/problem/1146/A

import java.util.Scanner;
public class GoodString{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        char[] input = sObj.nextLine().toCharArray();
        int aCount = 0;
        int result = 0;
        for(char c: input){
            if(c=='a'){
                aCount++;
            }
        }
        if(aCount==0){
            result=0;
        }
        else if((aCount*2-1)<input.length){
            result = aCount*2-1;
        }
        else{
            result = input.length;
        }
        System.out.println(result);
    }
}