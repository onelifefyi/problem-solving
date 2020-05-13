//problem: https://codeforces.com/problemset/problem/1009/A
import java.util.Scanner;

public class GameShop{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int noGames = sObj.nextInt();
        int noCash = sObj.nextInt();
        int[] priceGame = new int[noGames];
        int[] priceCash = new int[noCash];
        for(int i=0; i<noGames; i++){
            priceGame[i] = sObj.nextInt();
        }
        for(int j=0; j<noCash; j++){
            priceCash[j] = sObj.nextInt();
        }

        int count = 0;
        int x = 0;
        int y = 0;
        while(x<noGames && y<noCash){
            if(priceGame[x] <= priceCash[y]){
                count++;
                x++;
                y++;
            }
            else{
                x++;
            }
        }
        System.out.println(count);
    }
}