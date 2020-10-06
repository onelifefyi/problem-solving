import java.util.Scanner;

public class A{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int max = 0;
            int temp = 0;
            for(int i=0; i<3; i++){
                temp = sObj.nextInt();
                if(temp > max) max = temp;
            }
            System.out.println(max);
        }
    }
}