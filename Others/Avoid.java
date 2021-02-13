import java.util.Arrays;
import java.util.Scanner;
public class Avoid{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int temp = sObj.nextInt();
            sObj.nextLine();
            char[] input = sObj.nextLine().toCharArray();
            Arrays.sort(input);
            String result = new String(input);
            System.out.println(result);
        }
    }
}