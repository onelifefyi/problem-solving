// problem #35: http://codeforces.com/blog/entry/5301

import java.util.Scanner;
public class Parallelepiped {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int a1 = sObj.nextInt();
        int a2 = sObj.nextInt();
        int a3 = sObj.nextInt();

        System.out.println((int)(Math.sqrt(a1*a3/a2) + Math.sqrt(a1*a2/a3) + Math.sqrt(a2*a3/a1))*4);
    }
}
