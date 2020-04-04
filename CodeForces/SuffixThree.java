//problem: https://codeforces.com/problemset/problem/1281/A

import java.util.Scanner;
public class SuffixThree{
    static void getLan(String str){
        if(str.charAt(str.length()-1)=='u'){
            System.out.println("JAPANESE");
        }
        else if(str.charAt(str.length()-1)=='o'){
            System.out.println("FILIPINO");
        }
        else{
            System.out.println("KOREAN");
        }
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = Integer.parseInt(sObj.nextLine());
        String str = new String();
        for(int i=0; i<cases; i++){
            str = sObj.nextLine();
            getLan(str);
        }
    }
}