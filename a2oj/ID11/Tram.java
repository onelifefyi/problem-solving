// problem #19: https://codeforces.com/problemset/problem/116/A

import java.util.Scanner;
public class Tram{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int psngr = 0;
        int maxPsngr = 0;
        for(int i=0; i<n; i++){
            int left = sObj.nextInt();
            int enter = sObj.nextInt();
            if(psngr > maxPsngr) maxPsngr = psngr;
            psngr = psngr - left + enter;
        }
        System.out.println(maxPsngr);
    }
}