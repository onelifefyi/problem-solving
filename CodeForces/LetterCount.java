//problem: https://codeforces.com/problemset/problem/443/A

import java.util.Scanner;
import java.util.HashSet;
public class LetterCount{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        HashSet hSet = new HashSet();
        String input = sObj.nextLine();
        for(char ele: input.toCharArray()){
            if(ele == ' ' || ele == ','){
                continue;
            }
            hSet.add(ele);
        }
        System.out.println(hSet.size() - 2);
    }
}