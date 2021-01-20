import java.util.Scanner;
public class NumberSeries{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        try{
            int n = sObj.nextInt();
            boolean series7 = false;
            if(n%2==1) series7 = true;

            if(series7) System.out.println(0 + 7*(n/2));
            else System.out.println(0 + 6*(n/2 - 1));
        }
        catch(Exception E){
            System.out.println("Enter an Integer");
        }
    }
}