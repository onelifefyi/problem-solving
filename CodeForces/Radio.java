//problem: https://codeforces.com/problemset/problem/918/B

import java.util.Scanner;
import java.util.HashMap;

public class Radio{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int lookup = sObj.nextInt();
        int cmds = sObj.nextInt();
        sObj.nextLine();
        HashMap<String, String> hMap = new HashMap<String, String>();
        for(int i=0; i<lookup; i++){
            String[] s = sObj.nextLine().split(" ");
            hMap.put(s[1] + ";", "#" + s[0]);
        }
        for(int j=0; j<cmds; j++){
            String[] s2 = sObj.nextLine().split(" ");
            for(String strng: s2){
                System.out.print(strng + " ");
            }
            System.out.println(hMap.get(s2[1]));
        }
    }
}