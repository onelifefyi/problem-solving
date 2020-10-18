import java.util.Scanner;
public class A{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int x = sObj.nextInt();
            int y = sObj.nextInt();
            System.out.println(x^y);
        }
    }
}