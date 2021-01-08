// Problem: https://codeforces.com/contest/1467/problem/B
import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int z = sObj.nextInt();
        for(int i=0; i<z; i++){
            int n = sObj.nextInt();
            String arrFirst = "989";
            //String next = "0123456789";
            //String next = "0987654321";
            String next = "0123456789";
            StringBuilder sOut = new StringBuilder();
            //if(n <= 2) System.out.println(arrFirst.substring(0,n));
            // else{
            //     n -= 9;
            //     sOut.append(arrFirst);
            //     int count = n/10;
            //     for(int x=0; x<count; x++) sOut.append(next);
            //     n = n%10;
            //     sOut.append(next.substring(0,n));
            //     System.out.println(sOut);
            // }
            if(n <= 3) System.out.println(arrFirst.substring(0,n));
            else{
                sOut.append(arrFirst);
                n -= 3;
                int count = n/10;
                for(int x=0; x<count; x++) sOut.append(next);
                n = n%10;
                sOut.append(next.substring(0,n));
                System.out.println(sOut);
            }
        }
    }
}