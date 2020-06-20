//problem: https://codeforces.com/problemset/problem/727/A

import java.util.ArrayList;
import java.util.Scanner;
public class Transfer{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        ArrayList<Integer> aLst = new ArrayList<Integer>();
        int init = sObj.nextInt();
        int no = sObj.nextInt();
        aLst.add(no);
        while(no > init){
            if(no % 2 == 0){
                no = no/2;
                aLst.add(no);
            }
            else{
                no = no/10;
                aLst.add(no);
            }
        }
        if(no == init){
            System.out.println("YES");
            System.out.println(aLst.size());
            for(int i=aLst.size() -1; i>=0; i--){
                System.out.print(aLst.get(i) + " ");
            }
        }
        else{
            System.out.println("NO");
        }
        
    }
}