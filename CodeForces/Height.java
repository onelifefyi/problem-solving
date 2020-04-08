//problem: https://codeforces.com/problemset/problem/677/A

import java.util.Scanner;
public class Height{
    public static void main(String args[]){
        Scanner sObj = new Scanner(System.in);
        int persons = sObj.nextInt();
        int maxHeight = sObj.nextInt();
        int length = 0;
        sObj.nextLine();
        String[] input = sObj.nextLine().split(" ");
        for(String ele: input){
            if(Integer.parseInt(ele)<=maxHeight){
                length++;
            }
            else{
                length += 2;
            }
        }
        System.out.print(length);
    }
}