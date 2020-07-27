//problem: https://codeforces.com/problemset/problem/56/A

import java.util.Scanner;
import java.util.HashSet;
public class Bar{
    public static boolean isNum(String str){
        try{
            Integer.parseInt(str);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        HashSet<String> alcList = new HashSet<String>();
        int counter = 0;
        for(String str: "ABSINTH, BEER, BRANDY, CHAMPAGNE, GIN, RUM, SAKE, TEQUILA, VODKA, WHISKEY, WINE".split(". "))
        alcList.add(str);
        //System.out.println(alcList);
        for(int z=0; z<n; z++){
            String temp = sObj.nextLine();
            if(alcList.contains(temp)) counter++;
            else if(isNum(temp)) if(Integer.parseInt(temp) < 18) counter++;
        }
        System.out.println(counter);
    }
}