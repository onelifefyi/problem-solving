// problem: https://www.codechef.com/AUG20B/problems/CHEFWARS
import java.util.Scanner;

class Jedi{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int h = sObj.nextInt();
            int p = sObj.nextInt();
            int maxP = p;
            while(p>0){
                p = p/2;
                maxP += p;
            }
            if(maxP >= h) System.out.println(1);
            else System.out.println(0);
        }
    }
}