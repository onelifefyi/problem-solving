import java.util.Scanner;
public class FactRec{

    public static int findFact(int n){
        if(n < 2){
            return 1;
        }
        else {
            return n * FactRec.findFact(n-1);
        }
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        System.out.println(FactRec.findFact(n));
    }
}