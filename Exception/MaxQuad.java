
// Good One || Couldn't solve!!!

import java.util.Scanner;
import java.util.Arrays;
//import java.util.Collections;
public class MaxQuad{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        if(n<4) System.out.println("Invalid Input");
        else{
            int[] input = new int[n];
            for(int i=0; i<n; i++) input[i] = Integer.parseInt(sObj.nextLine());
            Arrays.sort(input);
            //System.out.println(Arrays.toString(input));
            int count = 4;
            int pointer = n-1;
            long total = 1;
            int ptr = n-1;
            while(count > 0){
                if(input[ptr] < 0) break;
                else total *= input[ptr--];
                //System.out.println("taking: " + input[ptr+1]);
                count--;
            }
            if(count==4 || count==2){
                ptr = 0;
                while(count > 0){
                    total *= input[ptr++];
                    count--;
                }
            }
            else{
                while(count > 0){
                    // System.out.println("taking: " + input[ptr]);
                    total *= input[ptr--];
                    count--;
                }
            }
            System.out.println(total);
        }
    }
}