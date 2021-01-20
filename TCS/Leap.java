import java.util.Scanner;
public class Leap{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        while(true){
            String input = sObj.next();
            try{
                long year = Long.parseLong(input);
                if(year%4 != 0) System.out.println("Not a leap year!");
                else{
                    if(year%100==0 && year%400!=0) System.out.println("Not a leap year!");
                    else System.out.println("It's leap year!");
                }
            }
            catch(Exception E){
                if(input.toLowerCase().equals("exit")) return;
                else System.out.println("Incorrect Input Format");
            }
        }
    }
}