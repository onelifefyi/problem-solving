// problem #5: https://codeforces.com/problemset/problem/271/A
import java.util.Scanner;
import java.util.HashSet;
public class BeautyYear{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int num = sObj.nextInt();
        int size = Integer.toString(num).length();
        while(true){
            num++;
            HashSet<Character> hSet = new HashSet<Character>();
            for(char ch: Integer.toString(num).toCharArray()) hSet.add(ch);
            if(hSet.size() >= size){
                System.out.println(num);
                return;
            }
        }
    }
}