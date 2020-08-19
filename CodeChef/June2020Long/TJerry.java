// Problem: 
import java.util.Scanner;

class TJerry{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            long ts = sObj.nextLong();
            while(ts%2 != 1) ts = ts/2;
            System.out.println(ts/2);
        }
    }
}