import java.util.Scanner;
//import java.util.HashSet;
public class StringMod{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        char[] line1 = sObj.nextLine().toLowerCase().toCharArray();
        char[] line2 = sObj.nextLine().toLowerCase().toCharArray();
        String line3 = sObj.nextLine();

        //HashSet<Character> vowels = new HashSet<Character>();
        //for(char ch: "aeiou") vowels.add(ch);

        for(char ch: line1){
            if("aeiouAEIOU".indexOf(ch) != -1) System.out.print("%");
            else System.out.print(ch);
        }
        System.out.println();

        for(char ch: line1){
            if("aeiouAEIOU".indexOf(ch) == -1) System.out.print("#");
            else System.out.print(ch);
        }
        System.out.println();

        System.out.println(line3.toUpperCase());
    }
}