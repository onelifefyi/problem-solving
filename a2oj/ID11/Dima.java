// problem #31 : https://codeforces.com/problemset/problem/272/A
import java.util.Scanner;
public class Dima {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int totalFing=-1;
        int ways=0;
        for(int i=0; i<n; i++)
        totalFing += sObj.nextInt();
        int currentPos = (totalFing)%(n+1);
        for(int x=1; x<=5; x++)
        if((currentPos + x)%(n+1) != 0) ways++;        
        System.out.println(ways);
        sObj.close();
    }
}
