import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int z=0; z<nos; z++){
            int x = sObj.nextInt();
            int y = sObj.nextInt();
            int n = sObj.nextInt();
            int k = n;
            if(x > n){
                System.out.println(0);
                continue;
            }
            while(k%x != y){
                if(k%x < y){
                    k -= y;
                }
                else{
                    k -= (k%x)-y;
                }
            }
            System.out.println(k);
        }
    }
}
