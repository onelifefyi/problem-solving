// Problem: https://codeforces.com/problemset/problem/1296/A

import java.util.Scanner;
public class OddSum{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int size = sObj.nextInt();
            sObj.nextLine();
            int temp = 0;
            boolean odd = false;
            boolean even = false;
            for(int i=0; i<size; i++){
                temp = sObj.nextInt();
                if(odd && even){
                    sObj.nextLine();
                    break;
                }
                if(temp % 2 == 0) even = true;
                else odd = true;
            }
            if(odd && even) System.out.println("YES");
            else if(!odd || size%2==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}