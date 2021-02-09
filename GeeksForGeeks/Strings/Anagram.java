import java.util.Scanner;
import java.util.Arrays;
public class Anagram{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String s1 = sObj.next();
        String s2 = sObj.next();

        int size = s1.length();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }

        boolean[] charList = new boolean[256];

        for(int i=0; i<size; i++) charList[s1.charAt(i)] = true;
        for(int j=0; j<size; j++){
            if(charList[s2.charAt(j)] != true){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("It's Anagram");
    }
}