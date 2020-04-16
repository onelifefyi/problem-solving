import java.util.Scanner;
public class FiboRec{

    public static int findFibo(int n){
        if(n < 1){
            return -1;
        }
        else if(n==1 || n==2){
            return n-1;
        }
        else return FiboRec.findFibo(n-1) + FiboRec.findFibo(n-2);
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        System.out.println(FiboRec.findFibo(n));
    }
}