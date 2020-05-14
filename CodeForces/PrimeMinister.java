//problem: https://codeforces.com/problemset/problem/1178/A
import java.util.Scanner;
public class PrimeMinister{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int[] seatList = new int[n];
        int total = 0;
        for(int i=0; i<n; i++){
            seatList[i] = sObj.nextInt();
            total += seatList[i];
        }

        // Checking if alice already has majority
        int aliceSeat = seatList[0];
        if(2*aliceSeat > total){
            System.out.println(1 + "\n" + 1);
            return;
        }
        int counter = 0;
        //calculating if majority posible for Alice or not
        int aliceTotal = aliceSeat;
        for(int i=1; i<n; i++){
            //System.out.print("checked: " + i);
            if(aliceSeat >= 2*seatList[i] ){
                counter++;
                aliceTotal += seatList[i];
            }
            //System.out.println("Alice's total : " + aliceTotal);
        }
        // if not possible print 0 and exit else print parties    
        if(2*aliceTotal <= total){
            System.out.println(0);
            return;
        }  
        else{
            System.out.println(counter + 1);
            System.out.print(1);
            aliceTotal = aliceSeat;
            for(int j=1; j<n; j++){
                if(aliceSeat >= 2*seatList[j] ){
                    aliceTotal += seatList[j];
                    System.out.print(" " + (j+1));
                    }
                //if(2*aliceTotal > total){
                //    return;
                //    }
                }
            }
        }
}