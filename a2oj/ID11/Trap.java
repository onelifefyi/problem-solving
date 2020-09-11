import java.util.HashSet;
import java.util.Scanner;
public class Trap {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        HashSet<Character> hSet = new HashSet<Character>();
        for(char ch: sObj.nextLine().toCharArray()){
            hSet.add(ch);
        }
        if(hSet.size()%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
