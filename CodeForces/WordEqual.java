//problem: https://codeforces.com/problemset/problem/59/A

import java.util.Scanner;
public class WordEqual{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int capsCounter = 0;
        String input = sObj.nextLine();
        for(char ele: input.toCharArray()){
            if(ele <= 90){
                capsCounter++;
            }
        }
        //System.out.println(capsCounter);
        if(capsCounter > input.length()/2){
            System.out.println(input.toUpperCase());
        }
        else {
            System.out.println(input.toLowerCase());
        }
    }
}