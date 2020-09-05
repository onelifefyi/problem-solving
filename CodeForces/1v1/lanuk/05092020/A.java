import java.util.Scanner;
import java.util.HashSet;
public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        HashSet<Integer> hSet1 = new HashSet<Integer>();
        HashSet<Integer> hSet2 = new HashSet<Integer>();
        int temp1 = 0;
        for(int i=0; i<n; i++){
            temp1 = sObj.nextInt();
            hSet1.add(temp1);
        }
        int temp2 = 0;
        for(int j=0; j<n; j++){
            temp2 = sObj.nextInt();
            hSet2.add(temp2);
        }
        hSet1.add(0);
        boolean uncommon = false;
        for(int ele: hSet2){
            if(!hSet1.contains(ele)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}