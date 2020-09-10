// problem #20: https://codeforces.com/problemset/problem/339/A

import java.util.Scanner;;

public class MathHelp{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        StringBuilder sOut = new StringBuilder();
        int[] count = new int[4];
        String input = sObj.nextLine();
        for(char ch: input.toCharArray()){
            if(ch=='1') count[1]++;
            else if(ch=='2') count[2]++;
            else if(ch=='3') count[3]++;
            else continue;
        }
        while(count[1] > 0){
            sOut.append("1+");
            count[1]--;
        }
        while(count[2] > 0){
            sOut.append("2+");
            count[2]--;
        }
        while(count[3] > 0){
            sOut.append("3+");
            count[3]--;
        }
        sOut.setLength(sOut.length()-1);
        System.out.println(sOut);
    }
}