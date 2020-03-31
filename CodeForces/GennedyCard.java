//problem: https://codeforces.com/problemset/problem/1097/A

import java.util.Scanner;
import java.util.HashSet;
public class GennedyCard{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String deskList = sObj.nextLine();
        String handList = sObj.nextLine();

        HashSet handSet = new HashSet();
        for(char ele: handList.toCharArray()){
            handSet.add(ele);
        }
        //System.out.println(handSet);
        //System.out.println(deskSet);
        for(char ele: deskList.toCharArray()){
            if(handSet.contains(ele)){
                System.out.print("Yes");
                return;
            }
        }
        System.out.print("No");
    }
}