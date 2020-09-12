import java.util.Scanner;
public class PStrings {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        String s1 = sObj.nextLine();
        String s2 = sObj.nextLine();
        for(int i=0; i<s1.length(); i++){
            char first =  s1.charAt(i);
            char second =  s2.charAt(i);
            if(first > 96) first -= 32;
            if(second > 96) second -= 32;
            if(first < second){
                System.out.println(-1);
                return;
            }
            else if(second < first){
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
        sObj.close();
    }
}
