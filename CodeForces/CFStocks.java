import java.util.Scanner;

public class CFStocks{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int m = sObj.nextInt();
        int r = sObj.nextInt();
        int minBuy = Integer.MAX_VALUE;
        int maxSell = Integer.MIN_VALUE;
        int temp = 0;

        for(int i=0; i<n; i++){
            temp = sObj.nextInt();
            if(temp < minBuy) minBuy = temp;
        }

        for(int j=0; j<m; j++){
            temp = sObj.nextInt();
            if(temp > maxSell) maxSell = temp;
        }

        if(maxSell < minBuy) System.out.println(r);        
        else System.out.println((r/minBuy) * maxSell + (r%minBuy));
    }
}