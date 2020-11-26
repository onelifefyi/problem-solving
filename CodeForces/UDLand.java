// Problem:  http://codeforces.com/problemset/problem/711/A

import java.util.Scanner;

public class UDLand{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        sObj.nextLine();
        boolean found = false;
        char[][] input = new char[n][5];
        for(int i=0; i<n; i++){
            String next = sObj.nextLine();
            input[i][2] = '|';
            char a = next.charAt(0);
            char b = next.charAt(1);
            if(a == 'O' && b == 'O' && !found){
                input[i][0] = input[i][1] = '+';
                found = true;
            }
            else{
                input[i][0] = a;
                input[i][1] = b;
            }
            char c = next.charAt(3);
            char d = next.charAt(4);
            if(c == 'O' && d == 'O' && !found){
                input[i][3] = input[i][4] = '+';
                found = true;
            }
            else{
                input[i][3] = c;
                input[i][4] = d;
            }
        }
        if(found){
            System.out.println("YES");
            for(int k=0; k<n; k++){
                for(int l=0; l<5; l++) System.out.print(input[k][l]);
                System.out.println();
            }
        }
        else System.out.println("NO");
    }
}