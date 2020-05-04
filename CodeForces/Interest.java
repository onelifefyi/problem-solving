//problem: https://codeforces.com/problemset/problem/1183/A
import java.util.Scanner;
public class Interest{
    public static void main(String[] args){
        Scanner sOBj = new Scanner(System.in);
        int temp = sOBj.nextInt();
        int no = temp;
        int sum = 0;
        while(true){
            //System.out.println("loopin no " + (1+i));
            sum = 0;
            no = temp;
            while(no != 0){
                sum += no%10;
                no = no/10;
            }
            //System.out.println("sum " + sum + " temp: " + temp);
            if(sum % 4 == 0){
                System.out.println(temp);
                break;
            }
            temp++;
        }
    }
}