// problem #21: https://codeforces.com/problemset/problem/71/A

import java.util.Scanner;
public class LongWord{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        sObj.nextLine();
        for(int css=0;css<n;css++){
            StringBuilder sOut = new StringBuilder();
            String input = sObj.nextLine();
            if(input.length() > 10){
                sOut.append(input.charAt(0));
                sOut.append(input.length()-2);
                sOut.append(input.charAt(input.length()-1));
            } else sOut.append(input);
            System.out.println(sOut);
        }
    }
}