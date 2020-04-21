//problem: https://codeforces.com/problemset/problem/1287/A
//pending: Understand question first
//approach: try counting no of patient students between angry students


import java.util.Scanner;
public class AngryStud{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = Integer.parseInt(sObj.nextLine());
        //int firstAngry = Integer.MAX_VALUE;
        //int noStudents = 0;
        //boolean pFlag = true;
        // for(int i=0; i<cases; i++){
        //     pFlag = true;
        //     noStudents = Integer.parseInt(sObj.nextLine());
        //     char[] seq = sObj.nextLine().toCharArray();
        //     for(int j=noStudents-1; j>=0; j--){
        //         if(seq[j] == 'A'){
        //             System.out.println(noStudents - (j+1));
        //             pFlag = false;
        //             break;
        //         }
        //         System.out.println(j + " Value " + seq[j]);
        //     }
        //     if(pFlag){
        //         System.out.println(0);
        //     }
        // }
        int maxPatient = 0;
        for(int i=0; i<cases; i++){
            maxPatient = 0;
            noStudents = Integer.parseInt(sObj.nextLine());
            char[] seq = sObj.nextLine().toCharArray();
            for(int j=0; j<noStudents; j++){
                if()
            }
        }
    }
}