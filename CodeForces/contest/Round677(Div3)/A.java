import java.util.Scanner;
public class A{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        sObj.nextLine();
        for(int zz=0; zz<css; zz++){
            String num = sObj.nextLine();
            int numLen = num.length();
            if(num.charAt(0) == '1') System.out.println(numLen*(numLen+1)/2);
            else if(num.charAt(0) == '2') System.out.println(numLen*(numLen+1)/2 + 10);
            else if(num.charAt(0) == '3') System.out.println(numLen*(numLen+1)/2 + 20);
            else if(num.charAt(0) == '4') System.out.println(numLen*(numLen+1)/2 + 30);
            else if(num.charAt(0) == '5') System.out.println(numLen*(numLen+1)/2 + 40);
            else if(num.charAt(0) == '6') System.out.println(numLen*(numLen+1)/2 + 50);
            else if(num.charAt(0) == '7') System.out.println(numLen*(numLen+1)/2 + 60);
            else if(num.charAt(0) == '8') System.out.println(numLen*(numLen+1)/2 + 70);
            else System.out.println(numLen*(numLen+1)/2 + 80);
            
        }
    }
}