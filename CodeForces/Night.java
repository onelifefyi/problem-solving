//problem: https://codeforces.com/problemset/problem/595/A

import java.util.Scanner;
public class Night{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int floors = sObj.nextInt();
        int flats = sObj.nextInt();
        boolean[] bArr = new boolean[floors*flats];
        sObj.nextLine();
        for(int i=0; i<floors*flats; i++){
            if(sObj.nextInt() == 1){
                bArr[i] = true;
            }
            if(sObj.nextInt() == 1){
                bArr[i] = true;
            }
        }
        int total = 0;
        for(boolean b: bArr){
            if(b == true){
                total++;
            }
        }
        System.out.println(total);
    }
}