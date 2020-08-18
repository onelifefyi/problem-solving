// problem: https://www.codechef.com/JUNE20B/problems/XYSTR

import java.util.Scanner;

class Dance{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        sObj.nextLine();
        for(int zz=0; zz<css; zz++){
            char[] input = sObj.nextLine().toCharArray();
            int max = 0;
            char first = input[0];
            for(int i=1; i<input.length; i++){
                if(input[i] != input[i-1]){
                    max++;
                    i++;
                }
            }
            System.out.println(max);
        }
    }
}