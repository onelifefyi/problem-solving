import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Amusing {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        for(char ch1: sObj.nextLine().toCharArray()){
            freq[ch1 - 'A']++;
        }
        for(char ch2: sObj.nextLine().toCharArray()){
            freq[ch2 - 'A']++;
        }
        for(char ch3: sObj.nextLine().toCharArray()){
            freq[ch3 - 'A']--;
        }
        for(int i=0; i<26; i++){
            if(freq[i] != 0){
                System.out.println("NO"); return;
            }
        }
            System.out.println("YES");
    }
}
