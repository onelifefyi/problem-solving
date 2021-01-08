// NOT Complete
import java.util.Scanner;
public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int z = sObj.nextInt();
        for(int css=0; css<z; css++){
            int size = sObj.nextInt();
            int[] points = new int[size];
            for(int i=0; i<size; i++) points[i] = sObj.nextInt();
            boolean common = false;
            int count = 0;
            for(int j=1; j<size-1; j++){
                if(points[j-1]<points[j] && points[j+1]>points[j]) count++;
                else if(points[j-1]<points[j] && points[j+1]<points[j]) count++;
                if(!common) if(points[j-1] == points[j+1]) common = true;
            }
            if(common) count -= 3;
            else count -= 2;
            System.out.println(Math.max(count, 0));
        }
    }
}