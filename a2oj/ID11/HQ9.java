import java.util.Scanner;
public class HQ9 {
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        for(char ch: sObj.nextLine().toCharArray()){
            if (ch=='H' || ch=='Q' || ch=='9'){
                System.out.println("YES"); return;
            }
        }
        System.out.println("NO");
    }
}
