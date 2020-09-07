//problem #3: https://codeforces.com/problemset/problem/266/B
import java.util.Scanner;
public class BoyGirl{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int time = sObj.nextInt();
        sObj.nextLine();
        char[] line = sObj.nextLine().toCharArray();
        for(int x=0; x<time; x++){
            for(int ii=1; ii<n; ii++){
                if(line[ii] == 'G' && line[ii-1] == 'B'){
                    line[ii-1] = 'G';
                    line[ii] = 'B';
                    ii++;
                }
            }
        }
        for(char ch: line) System.out.print(ch);
    }
}