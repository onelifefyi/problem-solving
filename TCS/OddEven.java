import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        String input = sObj.nextLine();
        long sum = 0;
        for(int i=0; i<input.length(); i++){
            if(i%2 == 0) sum += input.charAt(i) - '0';
            else sum -= input.charAt(i) - '0';
        }
        System.out.println(Math.abs(sum));
    }
}