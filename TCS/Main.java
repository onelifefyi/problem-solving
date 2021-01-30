import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        //System.out.println(Character.getNumericValue('7'));
        //System.out.println(String.valueOf("71"));

        // double d = sObj.nextDouble();
        // long l = sObj.nextLong();

        try{
            String i1 = sObj.next();
            String i2 = sObj.next();
            
            double d = Double.parseDouble(i1);
            long l = Long.parseLong(i2);
            System.out.println("double: " + d + " | long: " + l);
        }
        catch (Exception E){
            System.out.println("Incorrect Input format\n" + E);
        }

    }
}