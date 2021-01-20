import java.util.Scanner;
public class IsPrime{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        while(true){
            String input = sObj.next();
            try{
                long number = Long.parseLong(input);
                boolean isPrime = true;
                if(number < 0) System.out.println("Enter a positive number");
                else{
                    for(int i=2; i<=Math.sqrt(number); i++){
                        if(number%i==0){
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime) System.out.println("It's a prime number.");
                    else System.out.println("It's not a prime number.");
                }
            }
            catch(Exception E){
                if(input.toLowerCase().equals("exit")) return;
                else System.out.println("Incorrect Input Format");
            }
        }
    }
}