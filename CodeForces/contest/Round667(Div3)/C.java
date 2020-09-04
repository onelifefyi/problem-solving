// problem: https://codeforces.com/contest/1409/problem/C
// Didn't submit (Couldn't solve yet)
import java.util.Scanner;
import java.util.ArrayList;
public class C{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            ArrayList<Integer> factList = new ArrayList<Integer>();
            StringBuilder sOut = new StringBuilder();
            int n = sObj.nextInt();
            int x = sObj.nextInt();
            int y = sObj.nextInt();
            for(int i=1; i<=x; i++) if(x%i==0 && y%i==0) factList.add(i);
            //System.out.println("factors: " + factList);
            for(int ele=1; ele<x; ele++){
                int diff1 = y/ele - x/ele;
                if(diff1 >= n) continue;
                else{
                    int current = 0;
                    int count = 0;
                    while(current < y){
                        current = x + (ele * count++);
                        sOut.append(current + " ");
                    }
                    int num=0;
                    while(count < n && num >= 0){
                        num = current - ((count++)*ele);
                        sOut.append(num + " ");
                    }
                    while(count <n){
                        sOut.append(x + (ele * count++));
                    }
                    System.out.println(sOut + "res");
                    break;
                }
            }
            break;
        }
    }
}
