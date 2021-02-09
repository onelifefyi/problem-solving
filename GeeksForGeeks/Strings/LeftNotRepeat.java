// Find the left most non repeating character 
// Time O(n) | aux space O(1)
import java.util.Scanner;
public class LeftNotRepeat{        
    public static void main(String[] args){

        Scanner sObj = new Scanner(System.in);
        String s1 = sObj.next();
        int size = s1.length();

        int[] charList = new int[256];
        char current = ' ';
        for(int i=0; i<size; i++){
            current = s1.charAt(i);
            if(charList[current] == 0) charList[current] = 1;
            else if(charList[current] == 1) charList[current] = -1;
        }

        for(char ch: s1.toCharArray()){
            if(charList[ch] == 1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println(-1);
    }
}