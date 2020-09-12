import java.util.Scanner;
public class Bpp {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        sObj.nextLine();
        int plus = 0;
        int minus = 0;
        for(int i=0; i<n; i++){
            if(sObj.nextLine().charAt(1) == '+') plus++;
            else minus++;
        }
        System.out.println(plus - minus);
        sObj.close();
    }
}
