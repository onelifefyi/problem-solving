//problem: https://codeforces.com/problemset/problem/1159/A

import java.util.Scanner;
public class StonePile{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        char[] cInput = sObj.nextLine().toCharArray();
        int total = 0;
        int toadd = 0;
        for(char ele: cInput){
            if(ele == '+'){
                total++;
            }
            else if(ele == '-' && total >= 1){
                total--;
            }
        }
        System.out.println(total);
    }
}