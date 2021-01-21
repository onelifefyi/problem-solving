/*
    1234(base10) = 1000 + 200 + 30 + 4 => (1*10^3) + (2*10^2) + (3*10^1) + (4*10^0)
    1101(base2) = 1*8 + 1*4 + 0*2 + 1*1 => (1*2^3) + (1*2^2) + (0*2^1) + (1*2^0)
    f2(base16) = f*16^1 + 2*16^0
*/
import java.util.HashMap;
import java.util.Scanner;
public class Base17{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        char[] input = sObj.nextLine().toCharArray();

        HashMap<Character,Integer> hMap= new HashMap<Character,Integer>();
        int counter = 0;
        for(char ch: "0123456789ABCDEFG".toCharArray()) hMap.put(ch, counter++);
        
        long total = 0;
        int index = 0;
        for(int i=input.length-1; i>=0; i--) total += hMap.get(input[i]) * Math.pow(17, index++);

        System.out.println(total);
    }
}