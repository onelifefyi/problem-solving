//problem: https://codeforces.com/problemset/problem/1146/A

import java.util.Scanner;
public class GoodString{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        char[] input = sObj.nextLine().toCharArray();
        int aCount = 0;
        int lengthStr = input.length;
        for(char c: input){
            if(c=='a'){
                aCount++;
            }
        }
        if(aCount==0){
            lengthStr=0;
        }
        else{
            while(aCount<=lengthStr/2){
                lengthStr--;
            }
        }
        System.out.print(lengthStr);
    }
}