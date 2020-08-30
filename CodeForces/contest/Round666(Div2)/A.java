// problem: https://codeforces.com/contest/1397/problem/A
import java.util.Scanner;
import java.util.HashMap;

public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
            int n = sObj.nextInt();
            sObj.nextLine();
            for(int i=0; i<n; i++){
                for(char ele: sObj.nextLine().toCharArray()){
                    if(hMap.containsKey(ele)) hMap.put(ele, hMap.get(ele) + 1);
                    else hMap.put(ele, 1);
                }
            }
            boolean possible = true;
            for(int freq: hMap.values()){
                if(freq % n != 0){
                    possible = false;
                    break;
                }
            }
            if(possible) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}