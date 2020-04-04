//problem: https://codeforces.com/problemset/problem/1284/A
import java.util.Scanner;
public class NewYearName{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int fLen = sObj.nextInt();
        int sLen = sObj.nextInt();
        sObj.nextLine();
        String[] firstStr = sObj.nextLine().split(" ");
        String[] secondStr = sObj.nextLine().split(" ");
        int qryCnt = sObj.nextInt();
        int year = 0;
        for(int i=0; i<qryCnt; i++){
            year = sObj.nextInt() -1;
            sObj.nextLine();
            System.out.println(firstStr[year%fLen] + secondStr[year%sLen]);
        }
    }
}