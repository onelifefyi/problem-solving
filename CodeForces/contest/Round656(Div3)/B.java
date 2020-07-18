import java.util.Scanner;
import java.util.HashSet;
public class B{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        for(int z=0; z<n; z++){
            int a = sObj.nextInt();
            HashSet<Integer> hSet = new HashSet<Integer>();
            for(int i=0; i<a*2; i++){
                int zz = sObj.nextInt();
                if(hSet.contains(zz)) System.out.print(zz + " ");
                else hSet.add(zz);
            }
            System.out.println();
        }
    }
}