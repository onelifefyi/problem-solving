// Find the left most repeating character 
// Time O(n) | aux space O(1)
import java.util.Scanner;
public class LeftRepeat{        
    public static void main(String[] args){

        Scanner sObj = new Scanner(System.in);
        String s1 = sObj.next();

        boolean[] charList = new boolean[256];
        char leftMostRepeat = ' ';
        for(int i=s1.length()-1; i>=0; i--){
            if(charList[s1.charAt(i)] == true) leftMostRepeat = s1.charAt(i);
            else charList[s1.charAt(i)] = true;
        }
        if(leftMostRepeat == ' ') System.out.println(-1);
        else System.out.println(leftMostRepeat);
    }
}