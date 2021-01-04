import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class D{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            // int n = sObj.nextInt();
            // ArrayList<Integer> even = new ArrayList<Integer>();
            // ArrayList<Integer> odd = new ArrayList<Integer>();
            // int temp = 0;
            // for(int i=0; i<n; i++){
            //     temp = sObj.nextInt();
            //     if(temp%2==0) even.add(temp);
            //     else odd.add(temp);
            // }
            // Collections.sort(even);
            // Collections.sort(odd);
            // int evenPtr = even.size()-1;
            // int oddPtr = odd.size()-1;
            // int alice = 0;
            // int bob = 0;
            // for(int i=0; i<n; i++){
            //     if(i%2 == 0){
            //         if(even.isEmpty()) odd.remove(oddPtr--);
            //         else alice += even.remove(evenPtr--);
            //     }
            //     else{
            //         if(odd.isEmpty()) even.remove(evenPtr--);
            //         else bob += odd.remove(oddPtr--);                    
            //     }
            // }
            // if(alice == bob) System.out.println("Tie");
            // else if(alice > bob) System.out.println("Alice");
            // else System.out.println("Bob");
            int n = sObj.nextInt();
            int arr[] = new int[n];
            int alice = 0;
            int bob = 0;
            for(int i=0; i<n; i++) arr[i] = sObj.nextInt();
            Arrays.sort(arr);
            int pointer = n-1;
            for(int i=0; i<n; i++){
                if(i%2==0){
                    if(arr[pointer]%2 == 0) alice += arr[pointer];
                    pointer--;
                }
                else{
                    if(arr[pointer]%2 != 0) bob += arr[pointer];
                    pointer--;
                }
            }
            if(alice == bob) System.out.println("Tie");
            else if(alice > bob) System.out.println("Alice");
            else System.out.println("Bob");            
        }   
    }
}