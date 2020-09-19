// WA
import  java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int n = sObj.nextInt();
            int covid = sObj.nextInt();
            int left=0;
            int right=0;
            boolean allCovid = true;
            int temp = 0;
            for(int i=0; i<n; i++){
                temp = sObj.nextInt();
                if(allCovid && temp != covid) allCovid = false;
                if(temp < covid) left += covid - temp;
                else right += covid - temp;
            }
            if(allCovid) System.out.println(0);
            else if(left + right == 0) System.out.println(1);
            else System.out.println(2);
        }
    }
}
