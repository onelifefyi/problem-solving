//problem: https://codeforces.com/problemset/problem/1316/A
import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = Integer.parseInt(sObj.nextLine());
        int num, maxScore, toInc, myScore, total;
        for(int i=0; i<cases; i++){
            total = 0;
            num = sObj.nextInt();
            maxScore = sObj.nextInt();
            sObj.nextLine();
            int[] arr = new int[num];
            myScore = sObj.nextInt();
            toInc = maxScore - myScore;
            for(int j=1; j<num; j++){
                arr[j] = sObj.nextInt();
                total += arr[j];
            }
            sObj.nextLine();
            if(total <= toInc){
                System.out.println(myScore + total);
            }
            else{
                System.out.println(maxScore);
            }
        }
    }
}