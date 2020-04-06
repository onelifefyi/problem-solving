//problem: https://codeforces.com/problemset/problem/263/A

import java.lang.Math;
import java.util.Scanner;
public class BeautifulMatrix{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int current = 0;
        int result = 0;
        for(int i=0; i<25; i++){
            current = sObj.nextInt();
            if(current == 1){
                result = Math.abs((i/5) + 1 - 3) + Math.abs((i%5) + 1 -3); 
                //System.out.printf("row: %d coll: %d ",(i/5) + 1, (i%5) + 1 );
                System.out.println(result);
            }
        }
    }
}