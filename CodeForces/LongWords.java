//problem: https://codeforces.com/problemset/problem/71/A

import java.util.Scanner;
public class LongWords{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        String[] arrlist = new String[n];
        for(int i=0; i<n; i++){
            arrlist[i] = sObj.nextLine();
        }
        for(String ele: arrlist){
            if(ele.length() > 10){
                System.out.println(ele.charAt(0) + Integer.toString((ele.length()-2)) + ele.charAt(ele.length()-1));
            }
            else{
                System.out.println(ele);
            }
        }
    }
}