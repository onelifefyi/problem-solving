// Unsolved
import java.util.Scanner;
import java.util.ArrayList;
public class B {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            ArrayList<Long> aLst = new ArrayList<Long>();
            long x = 1;
            long total = 0;
            long prev = total;
            long val = sObj.nextLong();
            while(total < val){
                prev = total;
                total = x*(x+1)/2 + prev;
                aLst.add(total);
                x++;
            }
            System.out.println(aLst);
        }
    }
}
