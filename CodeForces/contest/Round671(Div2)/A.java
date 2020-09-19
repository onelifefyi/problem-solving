// Accepted
import java.util.Scanner;

public class A{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int size = sObj.nextInt();
            int[] arr = new int[size];
            sObj.nextLine();
            int index = 1;
            int bEven = 0;
            int rOdd = 0;
            for(char ch: sObj.nextLine().toCharArray()){
                if(bEven > 0 && rOdd > 0) break;
                if(index%2==0 && Character.getNumericValue(ch)%2==0){
                    bEven++;
                }
                else if(Character.getNumericValue(ch)%2==1){
                    rOdd++;
                }
                index++;
            }
            //System.out.println("bEven: " + bEven + " rOdd: " + rOdd);
            //System.out.println("result");
            if(size%2==0){
                if(bEven>0) System.out.println(2);
                else System.out.println(1);
            }
            else{
                if(rOdd > 0) System.out.println(1);
                else System.out.println(2);
            }
        }
    }
}