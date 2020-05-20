//problem: https://codeforces.com/problemset/problem/96/A
import java.util.Scanner;
public class Football{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String ipt = sObj.nextLine();      
        if(ipt.contains("1111111") || ipt.contains("0000000")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}