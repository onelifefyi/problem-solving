//problem: https://codeforces.com/problemset/problem/1065/A
// Nooooo! The problem I was having is 
import java.util.Scanner;
public class Chocolate{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = 0;
        cases = Integer.parseInt(sObj.nextLine());
        int cash = 0;
        int offer = 0;
        int freeBars = 0;
        int cost = 0;
        int totalChoc = 0;
        int currentChoc = 0;
        // for(int i=0; i<cases; i++){
        //     cash = sObj.nextInt();
        //     offer = sObj.nextInt();
        //     freeBars = sObj.nextInt();
        //     cost = sObj.nextInt();
        //     currentChoc = cash / cost;
        //     totalChoc = currentChoc;
        //     while(currentChoc >= offer){
        //         currentChoc = currentChoc / offer + currentChoc % offer;
        //         totalChoc += currentChoc;
        //         System.out.printf("Current %d, total %d\n", currentChoc, totalChoc);
        //     }
        // }
        // System.out.println(totalChoc);
        for(int i=0; i<cases; i++){
            cash = sObj.nextInt();
            offer = sObj.nextInt();
            freeBars = sObj.nextInt();
            cost = sObj.nextInt();
            currentChoc = cash/cost;
            totalChoc = 0;
            while(currentChoc>=offer){
                totalChoc += currentChoc - currentChoc%offer;
                currentChoc -= currentChoc/offer;
                //System.out.printf("Current %d, total %d\n", currentChoc, totalChoc);
            }
            System.out.println(totalChoc + currentChoc);
        }
    }
}