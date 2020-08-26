// problem: https://a2oj.com/p?ID=6

import java.util.Scanner;

class Baloon{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int len = sObj.nextInt();
            int easyNot = sObj.nextInt();
            int hardNot = sObj.nextInt();
            int easy = sObj.nextInt();
            for(int i=2; i<len; i++) sObj.nextInt();
            int hard = sObj.nextInt();
            if(easy == easyNot){
                if(hard == hardNot) System.out.println("BOTH");
                else System.out.println("EASY");
            }
            else if(hard == hardNot) System.out.println("HARD");
            else System.out.println("OKAY");
        }
    }
}