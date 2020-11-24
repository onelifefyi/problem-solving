import java.util.Scanner;

public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int n = sObj.nextInt();
            System.out.print(n + " ");
            for(int i=1; i<n; i++)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}