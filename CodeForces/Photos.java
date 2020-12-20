// https://codeforces.com/problemset/problem/707/A
import java.util.Scanner;
public class Photos{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int row = sObj.nextInt();
        int col = sObj.nextInt();
        sObj.nextLine();
        for(int i=0; i<row; i++){
            for(char ch: sObj.nextLine().toCharArray()){
                if(ch == 'C' || ch == 'M' || ch == 'Y'){
                    System.out.println("#Color");
                    return;
                }
            }
        }
        System.out.println("#Black&White");
    }
}