//problem: https://codeforces.com/problemset/problem/299/B

import java.util.Scanner;
public class SqrlJmp{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int sectors = sObj.nextInt();
        int jmp = sObj.nextInt();
        int maxBlock = 0;
        sObj.nextLine();
        for(char ch: sObj.nextLine().toCharArray()){
            if(ch == '#'){
                maxBlock++;
                if(maxBlock >= jmp){
                    System.out.println("NO");
                    return;
                }
            }
            else{
                maxBlock=0;
            }
        }
        System.out.println("YES");
    }
}