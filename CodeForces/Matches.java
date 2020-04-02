//problem: https://codeforces.com/problemset/problem/1223/A
import java.util.Scanner;
public class Matches{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int qrys = sObj.nextInt();
        int init = 0;
        for(int i=0; i<qrys; i++){
            init = sObj.nextInt();
            if(init == 2){
                System.out.println(2);
            }
            else{
                System.out.println(init%2==0?0:1);
                }
        }
    }
}
