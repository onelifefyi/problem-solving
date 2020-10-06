// problem: https://codeforces.com/problemset/problem/1426/A
import java.util.Scanner;
public class Floor {
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int n = sObj.nextInt();
            int flats = sObj.nextInt();
            int floorCount = 1;
            n -= 2;
            while(n > 0){
                n -= flats;
                floorCount++;
            }
            System.out.println(floorCount);
        }
        sObj.close();
    }
}
