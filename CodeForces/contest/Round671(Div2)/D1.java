// Accepted
import java.util.Arrays;
import java.util.Scanner;
public class D1 {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int[] input = new int[n];
        for(int i=0; i<n; i++) input[i] = sObj.nextInt();
        Arrays.sort(input);
        if(n%2 == 0)System.out.println((n-1)/2);
        else System.out.println(n/2);
        int x=0;
        for(int ii=n/2; ii<n; ii++){
            System.out.print(input[ii] + " ");
            if(x < n/2) System.out.print(input[x++] + " ");
        }
    }    
}
