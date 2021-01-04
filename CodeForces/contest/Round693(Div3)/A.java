import java.util.Scanner;
public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            // float l = sObj.nextFloat();
            // float b = sObj.nextFloat();
            // float n = sObj.nextFloat();
            // boolean possible = false;
            // int count = 1;
            // if(n == 1)System.out.println("YES");
            // else{
            //     while(l%2 == 0 && l>0){
            //         l = 1/2;
            //         count *= 2;
            //         if(count >= n){
            //             possible = true;
            //             break;
            //         }
            //     }
            //     while(b%2 == 0 && b>0){
            //         b = b/2;
            //         count *= 2;
            //         if(count >= n){
            //             possible = true;
            //             break;
            //         }
            //     }
            //     //System.out.println("Count: " + count);
            //     if(possible) System.out.println("YES");
            //     else System.out.println("NO");

            int l = sObj.nextInt();
            int b = sObj.nextInt();
            int n = sObj.nextInt();
            int count = 1;
            if(l%2 == 0) count *= l;
            if(b%2 == 0) count *= b;
            if(count >= n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}