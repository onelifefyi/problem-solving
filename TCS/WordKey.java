// Find out if a word is keyword or not
import java.util.Scanner;
import java.util.HashSet;
public class WordKey{
    public static void main(String[] args){
        HashSet<String> keywords = new HashSet<String>();
        for(String st: "break, case, continue, default, defer, else, for, func, goto, if, map, range, return, struct, type, var".split(", ")) keywords.add(st);
        System.out.println(keywords);

        Scanner sObj = new Scanner(System.in);
        String input = sObj.nextLine();
        if(keywords.contains(input.toLowerCase())) System.out.println("Its a keyword");
        else System.out.println("It isn't a keyword");
    }
}