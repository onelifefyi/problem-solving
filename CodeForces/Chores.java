//problem: https://codeforces.com/problemset/problem/169/A
import java.util.Scanner;
import java.util.Arrays;
public class Chores{    
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int total = sObj.nextInt();
        int P = sObj.nextInt();
        int V = sObj.nextInt();
        int[] lvl = new int[total];
        for(int i=0; i<total; i++){
            lvl[i] = sObj.nextInt();
        }
        Arrays.sort(lvl);
        if(lvl[V-1] == lvl[V]){
            System.out.println(0);
        }
        else{
            System.out.println(lvl[V]-lvl[V-1]);
        }
    }
}