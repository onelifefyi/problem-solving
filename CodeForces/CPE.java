//problem: https://codeforces.com/problemset/problem/1368/A

import java.util.Scanner;
public class CPE{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            long max = sObj.nextLong();
            long min = sObj.nextLong();
            long n = sObj.nextLong();
            if(min>max){
                long temp = max;
                max = min;
                min = temp;
            }
            int counter = 0;
            while(min <= n && max <= n){
                if(counter%2 == 0) min += max;
                else max += min;
                //System.out.println("Min/Max: " + min +"/" + max + "\tcounter: " + (1+counter));
                counter++;
            }
            System.out.println(counter);
        }
    }
}