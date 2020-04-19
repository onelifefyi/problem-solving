// problem: https://codeforces.com/problemset/problem/615/A

import java.util.Scanner;
import java.util.HashSet;
public class Bulbs{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        HashSet hSet = new HashSet();
        int switches = sObj.nextInt();
        int bulbs = sObj.nextInt();
        sObj.nextLine();

        for(int i=0; i<switches; i++){
            int curBulbs = sObj.nextInt();
            for(int j=0; j<curBulbs; j++){
                hSet.add(sObj.nextInt());
            }
            sObj.nextLine();
        }
        if(hSet.size() == bulbs){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}