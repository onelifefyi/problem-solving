import java.util.Scanner;
public class C{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = sObj.nextInt();
        for(int i=0; i<cases; i++){
            long total = 0;
            long n = sObj.nextLong();
            while(n > 0){
                total += (n*4-4)*(n/2);
                n -= 2;
            }
            System.out.println(total);
        }
    }
}