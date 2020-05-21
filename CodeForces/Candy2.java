import java.util.Scanner;
import java.lang.Math;
public class Candy2{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int tests = sObj.nextInt();
        for(int i=0; i<tests; i++){
            int n = sObj.nextInt();
            int sum=0; int k=0; int x=1;
            boolean flag = false;
            while(x<=n/2){
                sum = 0;
                k = 0;
                while(sum <= n){
                    sum += x*Math.pow(2,k);
                    //System.out.println("Sum on " + k + " is " + sum);
                    if(sum == n){
                        System.out.println(x);
                        flag = true;
                        break;
                    }
                    k++;
                }
                if(flag){
                    break;
                }
                x++;
            }
        }
    }
}