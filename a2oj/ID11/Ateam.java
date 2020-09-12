import java.util.Scanner;
public class Ateam {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int temp = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                if(sObj.nextInt() == 1) temp++;
            }
            if(temp >= 2) count++;
            temp = 0;
        }
        System.out.println(count);
    }
}
