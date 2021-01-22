// Swap two numbers without using 3rd variable

public class Swap{
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        a += b; 
        b = a-b;
        a = a-b;

        System.out.println("a: " + a + "; b: " + b);
    }
}