//problem: 
/*String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z). */

// Approach: 
/*One way is to iterate through the string and keep a counter to keep track of repetition,
if a mismatch found append string with counter and reset counter O(N) */

// Observation: I directly started to solve using string builder; Tip: I should first mention,
// a solution without string builder, direct string concat "string" + "new Strign" which takes
// O(N^2) and is bad... Now since StringBuilder is like arraylist it takes O(1) (genrally) and O(N) max

import java.util.Scanner;
public class StringCompression{

    static String compress(String input){
        StringBuilder SB = new StringBuilder();
        int counter = 1;
        int length = input.length();
        for(int i=1; i<length; i++){
            if(input.charAt(i) == input.charAt(i-1)){
                counter++;
            }
            else{
                SB.append(input.charAt(i-1) + Integer.toString(counter));
                counter = 1;
            }
        }
        SB.append(input.charAt(length-1) + Integer.toString(counter));
        return SB.length() < length ? SB.toString() : input;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String input = sObj.nextLine();
        System.out.println(compress(input));
    }
}