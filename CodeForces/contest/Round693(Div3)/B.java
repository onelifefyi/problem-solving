import java.util.Scanner;
public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int candies = sObj.nextInt();
            int count1 = 0;
            int count2 = 0;
            int temp = 0;
            for(int i=0; i<candies; i++){
                temp = sObj.nextInt();
                if(temp == 1) count1++;
                else count2++;
            }
            if(count1%2 != 0) System.out.println("NO");
            else if(count2%2!=0 && count1<2) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}