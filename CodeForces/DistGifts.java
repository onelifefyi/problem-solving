//problem: https://codeforces.com/problemset/problem/1186/A
import java.util.Scanner;
public class  DistGifts{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int people = sObj.nextInt();
        int pen = sObj.nextInt();
        int notebook = sObj.nextInt();
        if(people <= Math.min(pen, notebook)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}