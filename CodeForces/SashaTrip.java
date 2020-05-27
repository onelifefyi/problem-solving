//problem: https://codeforces.com/problemset/problem/1113/A

import java.util.Scanner;
public class SashaTrip{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int toTravel = sObj.nextInt()-1;
        int capacity = sObj.nextInt();
        if(toTravel<=capacity){
            System.out.println(toTravel);
            return;
        }
        else{
            int more_fuel_needed = toTravel-capacity;
            //System.out.println(more_fuel_needed + "more" );
            int cost = (more_fuel_needed*(2*2+(more_fuel_needed-1)))/2;
            System.out.println(cost + capacity);
        }
    }
}