import java.util.Scanner;

class Vowel{

    String vowels = "aeiou";

    // Method to get the sum of prime numbers between 1 to max
    int getSumOfPrime(int max){
        int total = 0;
        int count = 0;
        for(int j=2;j<=max;j++){
            count=0;
            for(int i=1;i<=j;i++){
                if(j%i==0){
                    count++;        
                }
            }
            if(count==2) total += j;   
        }
        return total;
    }

    // Method to find sum of digits of a number until we get single digit number
    int addTillSingle(int num){
        int sum = 0;
        while(num > 9){
            sum = 0;
            while(num > 0){
            sum += num%10;
            num = num/10;
            }
            num = sum;
        }
        return num;
    }

    // Driver method to process the replacement of vowels to number
    String process(String input){
        StringBuilder sOut = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            if(vowels.indexOf(input.charAt(i)) != -1){
                int primeSum = getSumOfPrime(i * 100);
                sOut.append(addTillSingle(primeSum));
            }
            else sOut.append(input.charAt(i));
        }
        return sOut.toString();
    }
}

public class Replacer{
    public static void main(String[] args){
        Vowel converter = new Vowel();
        Scanner sObj = new Scanner(System.in);

        // Taking user input
        String input = sObj.nextLine();

        // Method call to replace vowels with numbers as stated
        System.out.println(converter.process(input));
    }
}