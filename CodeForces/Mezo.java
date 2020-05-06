//problem: https://codeforces.com/problemset/problem/1285/A

import java.util.Scanner;

public class Mezo{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int numbers = Integer.parseInt(sObj.nextLine());
        char[] inputs = sObj.nextLine().toCharArray();
        int lCount = 0;
        int rCount = 0;
        for(char ele: inputs){
            if(ele == 'L'){
                lCount++;
            }
            else{
                rCount++;
            }
        }
        System.out.println(lCount + rCount + 1);

    }
}