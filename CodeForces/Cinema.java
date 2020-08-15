// problem: https://codeforces.com/problemset/problem/349/A

// Note: I had made a mistake naming placing counter[2] instead of counter[0]; So, always have unambigous names

import java.util.Scanner;
public class Cinema{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        long[] counter = new long[2];
        counter[0] = counter[1] = 0;
        
        int n = sObj.nextInt();
        for(int i=0; i<n; i++){
            int cash = sObj.nextInt();
            if(cash == 25) counter[0] += 1;
            else if(cash == 50){
                if(counter[0] < 1){
                    System.out.println("NO");
                    return;
                }
                else{
                    counter[1] += 1;
                    counter[0] -= 1;
                }
            }
            else{
                if(counter[1] < 1){
                    if(counter[0] < 3){
                        System.out.println("NO");
                        return;
                    }
                    else{
                        counter[0] -= 3;
                    }
                }
                else{
                    if(counter[0] < 1){
                        System.out.println("NO");
                        return;
                    }
                    else{
                        counter[0] -= 1;
                        counter[1] -= 1;
                    }
                }
            }
        }
        System.out.println("YES");
    }
}