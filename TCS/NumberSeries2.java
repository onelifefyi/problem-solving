import java.util.Scanner;
public class NumberSeries2{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        try{
            int n = sObj.nextInt();
            boolean series2 = false;
            if(n%2==1) series2 = true;

            if(series2) System.out.println((int) Math.pow(2,n/2));
            else System.out.println((int) Math.pow(3,n/2 - 1));
        }
        catch(Exception E){
            System.out.println("Enter an Integer");
        }
    }
}