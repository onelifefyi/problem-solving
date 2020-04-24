// problem: https://codeforces.com/problemset/problem/750/A

import java.util.Scanner;
public class NewYearHurry{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int numProblem = sObj.nextInt();
        int timeLeft = 60*4 - sObj.nextInt();
        int counter = 1;
        while(counter <= numProblem && timeLeft >= counter*5){
            //System.out.println("Problem #" + counter + " Time left now: " + timeLeft + " Time left after problem solved: " + (timeLeft - 5*counter));
            timeLeft -= 5*counter;
            counter++;
        }
        System.out.println(counter-1);
    }
}