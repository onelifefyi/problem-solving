// problem #2: https://codeforces.com/problemset/problem/263/A

import java.util.Scanner;
public class Beautiful{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                int temp = sObj.nextInt();
                if(temp == 1){
                    System.out.println(Math.abs(i-2) + Math.abs(j-2));
                }
            }
        }
    }
}