import java.util.Scanner;
import java.lang.Math;
import java.util.HashSet;
public class  HappyNumber{
    public static void main(String[] args){
        HashSet hSet = new HashSet();
        Scanner sObj = new Scanner(System.in);
        int number = sObj.nextInt();
        int sum=0;
        String result = new String();
         while(number!=1){
             sum = 0;
             while(number!=0){
                 sum+=Math.pow(number%10,2);
                 number = number/10;
             }
             if(hSet.contains(sum)){
                 break;
            }
             //System.out.println(sum);
             hSet.add(sum);             
             number = sum;
         }
         if(number==1){
            System.out.print("Happy Number");
         }
         else{
             System.out.print("Infinite Loop");
         }
    }
}