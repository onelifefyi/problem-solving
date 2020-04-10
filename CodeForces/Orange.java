// problem: https://codeforces.com/problemset/problem/200/B
import java.util.Scanner;
public class Orange{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int totalDrink = Integer.parseInt(sObj.nextLine());
        String[] concentration = sObj.nextLine().split(" ");
        float totalOrange = 0;
        for(String ele: concentration){
            totalOrange += Float.parseFloat(ele)/concentration.length;
        }
        System.out.println(totalOrange);
    }
}
