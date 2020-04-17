//problem: https://codeforces.com/problemset/problem/467/A

import java.util.Scanner;
public class Accomodation{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        int count = 0;
        for(int i=0; i<n; i++){
            if((sObj.nextInt() - sObj.nextInt()) <= -2){
                count++;
            }
        }
        System.out.println(count);
    }
}